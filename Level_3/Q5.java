import java.util.Scanner;

public class Q5 {
    static char[] unique(String s) {
        char[] t = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
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

    static String[][] freq(String s, char[] u) {
        String[][] r = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            int c = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == u[i])
                    c++;
            }

            r[i][0] = String.valueOf(u[i]);
            r[i][1] = String.valueOf(c);
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        char[] u = unique(t);
        String[][] r = freq(t, u);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < r.length; i++)
            System.out.println(r[i][0] + "\t\t" + r[i][1]);
    }
}