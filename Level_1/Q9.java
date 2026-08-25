import java.util.Scanner;

public class Q9 {
    static String upper(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z')
                c = (char)(c - 32);

            r += c;
        }

        return r;
    }

    static boolean cmp(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        String a = upper(t);
        String b = t.toUpperCase();

        System.out.println("User: " + a);
        System.out.println("Built-in: " + b);
        System.out.println("Same: " + cmp(a, b));
    }
}