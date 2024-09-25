import java.util.Scanner;
class Bill{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        float d=obj.nextFloat();
        float e=obj.nextFloat();
        float f=obj.nextFloat();
        System.out.print("Item:Item1  ");
        System.out.print("  Quantity:"+a);
        System.out.println("  Price:$"+d);
        System.out.print("Item:Item2  ");
        System.out.print("  Quantity:"+b);
        System.out.println("  Price:$"+e);
        System.out.print("Item:Item3  ");
        System.out.print("  Quantity:"+c);
        System.out.print("  Price:$"+f);
    }
}