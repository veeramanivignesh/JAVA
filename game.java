import java.util.Random;
import java.util.Scanner;
public class game
{
	public static void main(String[] args)
	{
		
		
		while(true){
			Random input = new Random();
		        int a = input.nextInt(100);
			Scanner n = new Scanner(System.in);
			int b = n.nextInt();
			if (a == b){
				System.out.print("Correct");
				break;	
}
			else {
				System.out.print("Wrong");

}		
}
				}
}