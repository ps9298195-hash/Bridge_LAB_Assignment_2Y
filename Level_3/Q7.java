import java.util.Scanner;

public class Q7 {
    static boolean p1(String s) {
        int a = 0;
        int b = s.length() - 1;

        while (a < b) {
            if (s.charAt(a) != s.charAt(b))
                return false;

            a++;
            b--;
        }

        return true;
    }

    static boolean p2(String s, int a, int b) {
        if (a >= b)
            return true;

        if (s.charAt(a) != s.charAt(b))
            return false;

        return p2(s, a + 1, b - 1);
    }

    static char[] rev(String s) {
        char[] r = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            r[i] = s.charAt(s.length() - 1 - i);

        return r;
    }

    static boolean p3(String s) {
        char[] a = s.toCharArray();
        char[] r = rev(s);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != r[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        System.out.println("Logic 1 = " + p1(t));
        System.out.println("Logic 2 = " + p2(t, 0, t.length() - 1));
        System.out.println("Logic 3 = " + p3(t));
    }
}