import java.util.*;

class Solution {
    public String decodeStringf(String s) {
        java.util.Stack<String> stack = new java.util.Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch != ']') {
                stack.push(String.valueOf(ch));
            } 
            else {
                String str = "";

                while(!stack.peek().equals("[")) {
                    str = stack.pop() + str;
                }

                stack.pop(); 

                String num = "";
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num = stack.pop() + num;
                }

                int count = Integer.parseInt(num);

                String repeated = "";
                for(int i = 0; i < count; i++) {
                    repeated += str;
                }

                stack.push(repeated);
            }
        }

        String result = "";
        while(!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}

class decodeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        Solution s=new Solution();
        System.out.println( s.decodeStringf(st));
    }

}