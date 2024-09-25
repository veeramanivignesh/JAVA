import java.util.Scanner;
class Vote{
 public static void main(String args[]){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
if(n>=18)
  System.out.println("You are eligible to vote");
else
  System.out.println("You are not eligible to vote");
}
}