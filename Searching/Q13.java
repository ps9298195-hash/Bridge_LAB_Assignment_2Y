import java.util.Scanner;

public class Q13 {
    static boolean search(int[][] a, int x) {
        int r = a.length;
        int c = a[0].length;

        int l = 0;
        int h = r * c - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;

            int i = m / c;
            int j = m % c;

            if (a[i][j] == x)
                return true;

            if (a[i][j] < x)
                l = m + 1;
            else
                h = m - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();
        int c = s.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = s.nextInt();

        int x = s.nextInt();

        System.out.println(search(a, x));
    }
}