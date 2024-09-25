import java.util.Scanner;
class SumN{
 public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("enter positive number :");
int n = s.nextInt();
int a=0;
for(int i=1;i<=n;i++){
	a=a+i;
}
System.out.println("sum="+a);

 }
}