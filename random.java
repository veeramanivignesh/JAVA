import java.util.Random;
import java.util.Scanner;
public class random
{
	public static void main(String[] args)
	{
		
		
		while(true){
			Random input = new Random();
		        int a = input.nextInt(1,10);
			int b = input.nextInt(1,10);
			System.out.println("What is "+a+" x "+b+" ?");
			int t = a*b;
			Scanner n =  new Scanner(System.in);
			System.out.print("Enter your answer(or 0 to exit):");
			int c = n.nextInt();
			if (c == 0){
				System.out.println("Thank you");
				break;
} 
			else if (c == t){
				System.out.println("It's Correct");

}
			else{
				System.out.println("Incorrect.The answer is "+t);
}
}		

	}
}