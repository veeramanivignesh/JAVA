import java.util.*;
public class QueueProblem1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        java.util.Queue<Integer> queue=new java.util.LinkedList<>();
        java.util.Stack<Integer> stack=new java.util.Stack<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                stack.push(arr[i]);
            } else {
                queue.add(arr[i]);
            }
        }
        queue.add(arr[n - 1]);
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        int a=queue.poll();
        while(!queue.isEmpty()){
            int b=queue.poll();
            if(a>b){
                System.out.println("No");
                return;
            }
            a=b;
        }
        System.out.println("yes");
    }
}