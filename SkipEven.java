import java.util.Scanner;
class SkipEven{
 public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.print("enter a number : ");

int n = s.nextInt();
System.out.print("1 to "+n+" odd number is: "); 
for(int i=1;i<=n;i++){
	if (i%2!=0){
		
		System.out.print(i);
}
	else{
		System.out.print(" ");
}

	
}


 }
}