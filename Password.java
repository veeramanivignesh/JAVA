import java.util.Scanner;
class Password{
 public static void main(String args[]){
String pass="vicky";
while(true){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter pass : ");
        String n = s.nextLine();
	if(n.equals(pass)){
		System.out.println("Pass word is correct");
		break;
}
	else{
		System.out.println("In correct pass.Try again later");
}
}


 }
}