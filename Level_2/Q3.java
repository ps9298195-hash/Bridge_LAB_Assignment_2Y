import java.util.Scanner;

public class Q3 {
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

    static String[][] data(String[] a) {
        String[][] r = new String[a.length][2];

        for (int i = 0; i < a.length; i++) {
            r[i][0] = a[i];
            r[i][1] = String.valueOf(len(a[i]));
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        String[] a = words(t);
        String[][] r = data(a);

        System.out.println("Word\tLength");

        for (int i = 0; i < r.length; i++)
            System.out.println(r[i][0] + "\t" + Integer.parseInt(r[i][1]));
    }
}