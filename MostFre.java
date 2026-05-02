import java.util.Scanner;

public class MostFre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            int count=0;
            for(int i=j;i<n;i++){
                if(arr[j]==arr[i]){
                    count++;
                }
                if(count>n/2){
                    System.out.println(arr[j]);
                    return;
                }
            }
        }
        System.err.println("-1");
    }
}
