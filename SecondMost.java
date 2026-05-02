import java.util.Scanner;

public class SecondMost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();

        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        int first = 0, second = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > freq[first]) {
                second = first;
                first = i;
            } else if (freq[i] > freq[second] && freq[i] != freq[first]) {
                second = i;
            }
        }

        System.out.println("Second most frequent character: " + (char)(second + 'a'));
    }
}