import java.util.Scanner;
class Divisiable{
 public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("Enter limit : ");
int n = s.nextInt();
Scanner v = new Scanner(System.in);
System.out.print("Enter divider : ");
int k = v.nextInt();
for(int i=1;i<=n;i++){
	if(i%k==0){
		System.out.println("The first number divisible by "+k+" is "+i);
		break;
}
}
 }
}