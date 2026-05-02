import java.util.Scanner;

public class ArrayPlaindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                System.out.println("Not Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome");
    }
}
