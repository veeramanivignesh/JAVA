import java.util.Scanner;

public class week2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter a number: ");
        int a =input.nextInt();
        switch (a) {
            
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
	    case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
    
}