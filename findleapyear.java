import java.util.Scanner;
public class findleapyear
{
	public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int a = input.nextInt();
		if ((a%4==0)&&(a%100!=0)||(a%400==0))
		{
			System.out.print(a+" is a leap Year");
		}
		else
		{
			System.out.print(a+" is not a leap year");
		}
}
}