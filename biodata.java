import java.util.Scanner;
class Biodata{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String name=in.next();
        int age=in.nextInt();
        String dept=in.next();
        float hight=in.nextFloat();
        System.out.println("name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Department:"+dept);
        System.out.println("Hight:"+hight);
    }

}