import java.util.Scanner;
class Fact{
 public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("enter the number : ");
int n = s.nextInt();
int a=1;
for(int i=n;i>=1;i--){
	a=a*i;
	
}
System.out.println("Fact is : "+a);
 }
}