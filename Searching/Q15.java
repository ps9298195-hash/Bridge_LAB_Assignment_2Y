import java.util.Scanner;
import java.util.Arrays;

public class Q15 {
    static int missing(int[] a) {
        int n = a.length;
        boolean[] v = new boolean[n + 1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] <= n)
                v[a[i]] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!v[i])
                return i;
        }

        return n + 1;
    }

    static int search(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == x)
                return m;

            if (a[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        int x = s.nextInt();

        System.out.println("First Missing Positive = " + missing(a));

        Arrays.sort(a);

        System.out.println("Sorted Array:");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println();
        System.out.println("Target Index = " + search(a, x));
    }
}