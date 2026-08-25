import java.util.Scanner;

public class Q7 {
    static int[] trim(String s) {
        int st = 0;
        int en = s.length() - 1;

        while (st <= en && s.charAt(st) == ' ')
            st++;

        while (en >= st && s.charAt(en) == ' ')
            en--;

        return new int[]{st, en + 1};
    }

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

        String t = s.nextLine();

        int[] p = trim(t);

        String a = sub(t, p[0], p[1]);
        String b = t.trim();

        System.out.println("User = " + a);
        System.out.println("Built-in = " + b);
        System.out.println("Same = " + cmp(a, b));
    }
}