import java.util.*;
public class CommonChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 =sc.next();
        String s2 =sc.next();

        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s2.toCharArray()) {
            if (freq[ch - 'a'] > 0) {
                System.out.print(ch + " ");
                freq[ch - 'a']=0; 
            }
        }
    }
}