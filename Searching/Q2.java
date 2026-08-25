import java.util.Scanner;
import java.util.HashSet;

public class Q2 {
    static String rem(String s) {
        StringBuilder b = new StringBuilder();
        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!h.contains(c)) {
                b.append(c);
                h.add(c);
            }
        }

        return b.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();

        System.out.println(rem(t));
    }
}