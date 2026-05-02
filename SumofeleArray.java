import java.util.*;
public class SumofeleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ele=arr[i];
            int sum=0;
            while(ele!=0){
                int d=ele/10;
                sum+=d;
                ele%=10;
            }
            arr[i]=sum;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
