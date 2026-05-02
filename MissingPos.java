import java.util.Scanner;

public class MissingPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        if(min<0){
            min=0;
        }
        for(int i=min+1;i<Integer.MAX_VALUE;i++){
            int f=1;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    f=0;
                }
            }
            if(f!=0){
                System.err.println(i);
                return;
            }
        }
    }
}
