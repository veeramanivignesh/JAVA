class Swap{
    public static void main(String[] args){
        int a=10;
        int b=6;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:");
        System.out.println(a);
        System.out.print(b);
    }
}