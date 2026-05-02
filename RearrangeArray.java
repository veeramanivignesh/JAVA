import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int[] pos=new int[n];
        int[] neg=new int[n];
        for(int i=0;i<n;i++){
            pos[i]=Integer.MAX_VALUE;
            neg[i]=Integer.MIN_VALUE;
        }
        int p=0,ne=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg[ne++]=arr[i];
            }else{
                pos[p++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(pos[i]!=Integer.MAX_VALUE && neg[i]!=Integer.MIN_VALUE){
                System.out.print(pos[i]+" "+neg[i]+" ");
            }else if(pos[i]!=Integer.MAX_VALUE){
                System.out.print(pos[i]+" ");
            }else if(neg[i]!=Integer.MIN_VALUE){
                System.out.print(neg[i]+" ");
            }
        }
    }
}