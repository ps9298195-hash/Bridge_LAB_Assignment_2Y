import java.util.Scanner;

public class Q4 {
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
        String[] t = new String[len(s) + 1];
        int k = 0;
        String x = "";

        for (int i = 0; i < len(s); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                x += c;
            } else if (!x.equals("")) {
                t[k++] = x;
                x = "";
            }
        }

        if (!x.equals(""))
            t[k++] = x;

        String[] a = new String[k];

        for (int i = 0; i < k; i++)
            a[i] = t[i];

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

    static int[] find(String[][] a) {
        int x = 0;
        int y = 0;

        for (int i = 1; i < a.length; i++) {
            if (Integer.parseInt(a[i][1]) < Integer.parseInt(a[x][1]))
                x = i;

            if (Integer.parseInt(a[i][1]) > Integer.parseInt(a[y][1]))
                y = i;
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();

        String[] a = words(t);
        String[][] r = data(a);
        int[] x = find(r);

        System.out.println("Shortest = " + r[x[0]][0]);
        System.out.println("Longest = " + r[x[1]][0]);
    }
}