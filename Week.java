
import java.util.Scanner;
class week{
  public static void main(String arg[]){
Scanner s = new Scanner(System.in);
int n =s.nextInt();
switch (n){
  case 1:
    System.out.println("sunday");
    break;
  case 2:
    System.out.println("Monday");
   break;
 case 3:
    System.out.println("Tuesday");
   break;
 case 4:
   System.out.println("Wednesday");
   break;
 case 5:
   System.out.println("Thursday");
   break;
 case 6:
   System.out.println("Friday");
   break;
 case 7:
   System.out.println("Saturday");
   break;
 default:
  System.out.println("invalid");
  break;
 }
}
}