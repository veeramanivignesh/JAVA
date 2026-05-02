import java.util.Scanner;

class Stack {
    int maxSize;
    int[] stackArray;
    int top;
    Stack(int size){
        maxSize=size;
        stackArray=new int[size];
        top=-1;
    }
    void push(String value){
        if(top==maxSize-1){
            
        }else{
            if(value.equals("+")){
               int v1= pop();
               int v2= pop();
               stackArray[++top]=v2+v1;
            }else if(value.equals("-")){
                int v1= pop();
               int v2= pop();
               stackArray[++top]=v2-v1;
            }else if(value.equals("*")){
                int v1= pop();
               int v2= pop();
               stackArray[++top]=v2*v1;
            }else if(value.equals("/")){
                int v1= pop();
               int v2= pop();
               stackArray[++top]=v2/v1;
            }
            else{
                stackArray[++top]=Integer.parseInt(value);
            }
        }
    }
    int pop(){
        if(top==-1){
            return -1;
        }else{
            return stackArray[top--];
        }
    }
    void display(){
        System.out.println(stackArray[top]);
    }
}

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st=sc.nextLine().split(" ");
        int s=st.length;
        Stack stack=new Stack(s);
        for(int i=0;i<s;i++){
            stack.push(st[i]);
        }
        stack.display();
    }
}
