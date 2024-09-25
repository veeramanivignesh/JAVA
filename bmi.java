import java.util.Scanner;
public class bmi
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the your weight:");
		float w = input.nextFloat();
		System.out.print("Enter the your hight:");
		float h = input.nextFloat();
		float c = w/(h*h);
		if (c<=18.5)
		{
			System.out.print("BMI: "+c+", Category: Underweight ");
		}
		else if ((18.5<=c)&&(c<24.9))
		{
			System.out.print("BMI: "+c+", Category: Normal weight ");
		}
		else if  ((25.0 <=c)&&(c<29.9))
		{
			System.out.print("BMI: "+c+", Category: Overweight ");
		}
		else 
		{
			System.out.print("BMI: "+c+", Category: Obesity");
		}



	}
}