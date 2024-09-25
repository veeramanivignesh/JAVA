import java.util.Scanner;

class Greet{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of studens : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nameList = new String[n];

        System.out.println("Enter the name of the students : ");
        for(int i=0;i<n;i++){
            System.out.print("Name of Student "+(i+1)+": ");
            nameList[i] = input.nextLine();
        }

        if(nameList.length == 0){
            return;
        }
        else{
            for(String stu : nameList){
            System.out.println("Hi "+stu+"!");
        }
        }
    }
}