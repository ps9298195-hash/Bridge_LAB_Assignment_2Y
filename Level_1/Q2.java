import java.util.Scanner;

public class Q2 {
    static String sub(String s, int a, int b) {
        String r = "";

        for (int i = a; i < b; i++)
            r += s.charAt(i);

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

        String t = s.next();
        int a = s.nextInt();
        int b = s.nextInt();

        String x = sub(t, a, b);
        String y = t.substring(a, b);

        System.out.println("User substring: " + x);
        System.out.println("Built-in substring: " + y);
        System.out.println("Same: " + cmp(x, y));
    }
}