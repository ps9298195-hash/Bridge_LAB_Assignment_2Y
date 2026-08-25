import java.util.Scanner;

public class Q10 {
    static String[] deck() {
        String[] s = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] r = {
            "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"
        };

        String[] d = new String[s.length * r.length];
        int k = 0;

        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < r.length; j++)
                d[k++] = r[j] + " of " + s[i];

        return d;
    }

    static String[] shuffle(String[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i + (int)(Math.random() * (a.length - i));

            String t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        return a;
    }

    static String[][] distribute(String[] d, int p) {
        if (d.length % p != 0)
            return null;

        int n = d.length / p;
        String[][] r = new String[p][n];
        int k = 0;

        for (int i = 0; i < p; i++)
            for (int j = 0; j < n; j++)
                r[i][j] = d[k++];

        return r;
    }

    static void show(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Player " + (i + 1));

            for (int j = 0; j < a[i].length; j++)
                System.out.println(a[i][j]);

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p = s.nextInt();

        if (p <= 0) {
            System.out.println("Invalid number of players");
            return;
        }

        String[] d = deck();
        d = shuffle(d);

        String[][] r = distribute(d, p);

        if (r == null) {
            System.out.println("Cards cannot be equally distributed");
            return;
        }

        show(r);
    }
}