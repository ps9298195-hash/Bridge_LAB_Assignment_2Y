import java.util.Scanner;

public class Heap_Sort {
    static void heap(int[] a, int n, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int m = i;

        if (l < n && a[l] > a[m])
            m = l;

        if (r < n && a[r] > a[m])
            m = r;

        if (m != i) {
            int t = a[i];
            a[i] = a[m];
            a[m] = t;

            heap(a, n, m);
        }
    }

    static void sort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            heap(a, a.length, i);

        for (int i = a.length - 1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;

            heap(a, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        sort(a);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}