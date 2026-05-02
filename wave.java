// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class wave {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
    
      for(int i=0;i<var2;i++){
        var3[i]=var1.nextInt();
      }
      for(int var4 = 0; var4 < var2 ; var4+=2) {
        System.out.println(var3[var4+1]);
        System.out.println(var3[var4]);
      }

   }
}
