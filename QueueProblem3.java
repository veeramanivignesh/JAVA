import java.util.*;
public class QueueProblem3 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        java.util.Queue<Integer> queue=new java.util.LinkedList<>();
        java.util.Stack<Integer> stack=new java.util.Stack<>();
        java.util.Queue<Integer> Otqueue=new java.util.LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            Otqueue.add(stack.pop());
        }
        while(!queue.isEmpty()){
            Otqueue.add(queue.poll());
        }
        while(!Otqueue.isEmpty()){
            System.out.print(Otqueue.poll()+" ");
        }
    }
}
