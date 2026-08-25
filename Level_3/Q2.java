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

    static char[] unique(String s) {
        int n = len(s);
        char[] t = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean u = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    u = false;
                    break;
                }
            }

            if (u)
                t[k++] = s.charAt(i);
        }

        char[] r = new char[k];

        for (int i = 0; i < k; i++)
            r[i] = t[i];

        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        char[] a = unique(t);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}