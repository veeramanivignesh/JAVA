import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Current balance:");
        int a =s.nextInt();
               System.out.print("\n Withdrawal amount:");
        int b =s.nextInt();
        double c=a-b;
        if (c>=0)
		System.out.println("Withdrawal successful.New balance:"+c);
	else
		System.out.println("Error:Insufficicient balance.");

        

        
    }
    
}    