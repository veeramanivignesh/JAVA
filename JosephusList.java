import java.util.*;

public class JosephusList {
    public static void main(String[] args) {
        int n = 7; // change input
        System.out.println(findSurvivor(n));
    }

    public static int findSurvivor(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add soldiers 1 to N
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {

            // Kill next soldier
            index = (index + 1) % list.size();
            list.remove(index);

            // Move to next alive soldier
            // (no need to +1 because list shifts)
        }

        return list.get(0);
    }
}