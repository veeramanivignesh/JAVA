import java.util.*;
public class AddOneUntilEqual {
    public static int Max(int n,int[] arr){
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static boolean isEqual(int n,int[] arr){
        int first=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]!=first){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        while(!isEqual(n,arr)){
            int maxIndex=Max(n,arr);
            for(int i=0;i<n;i++){
                if(i!=maxIndex){
                    arr[i]++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}