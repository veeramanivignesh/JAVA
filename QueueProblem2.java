
import java.util.Scanner;

public class QueueProblem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=n/2;
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" "+arr[i+s]+" ");
        }
        if(n%2!=0){
            System.out.print(arr[n-1]);
        }
    }
}
