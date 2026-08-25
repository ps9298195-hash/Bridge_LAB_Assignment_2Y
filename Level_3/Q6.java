import java.util.Scanner;

public class Q6 {
    static String[] freq(String s) {
        char[] a = s.toCharArray();
        int[] f = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '0')
                continue;

            f[i] = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    f[i]++;
                    a[j] = '0';
                }
            }
        }

        int n = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != '0')
                n++;
        }

        String[] r = new String[n];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != '0')
                r[k++] = a[i] + " = " + f[i];
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        String[] r = freq(t);

        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }
}