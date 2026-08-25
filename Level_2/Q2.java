import java.util.Scanner;

public class Q2 {
    static int len(String s) {
        int n = 0;

        while (true) {
            try {
                s.charAt(n);
                n++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return n;
    }

    static String[] words(String s) {
        int c = 0;
        boolean w = false;

        for (int i = 0; i < len(s); i++) {
            char ch = s.charAt(i);

            if (ch != ' ' && !w) {
                c++;
                w = true;
            }

            if (ch == ' ')
                w = false;
        }

        String[] a = new String[c];
        int k = 0;
        String x = "";

        for (int i = 0; i < len(s); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                x += ch;
            } else if (!x.equals("")) {
                a[k++] = x;
                x = "";
            }
        }

        if (!x.equals(""))
            a[k] = x;

        return a;
    }

    static boolean cmp(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        String[] a = words(t);
        String[] b = t.split(" ");

        System.out.println("Same = " + cmp(a, b));
    }
}