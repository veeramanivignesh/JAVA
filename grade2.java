import java.util.Scanner;
public class grade2
{
	public static void main(String[] args)
	{
		System.out.print("Enter the your total mark:");
		Scanner input = new Scanner(System.in);
		int mark = input.nextInt();
		if ((mark <= 100)&&(mark>=90))
		{
			System.out.println("Grade: A");
		}
		else if ((mark < 90)&&(mark>=80))
		{
			System.out.println("Grade: B");
		}
		else if ((mark < 80)&&(mark>=70))
		{
			System.out.println("Grade: C");
		}
		else if ((mark < 70)&&(mark>=60))
		{
			System.out.println("Grade: D");
		}

		else 
		{
			System.out.println("Grade: F");
		}



	}
}