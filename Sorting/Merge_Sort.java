import java.util.Scanner;

public class Merge_Sort {
    static void merge(int[] a, int l, int m, int r) {
        int[] t = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
            if (a[i] <= a[j])
                t[k++] = a[i++];
            else
                t[k++] = a[j++];
        }

        while (i <= m)
            t[k++] = a[i++];

        while (j <= r)
            t[k++] = a[j++];

        for (i = 0; i < t.length; i++)
            a[l + i] = t[i];
    }

    static void sort(int[] a, int l, int r) {
        if (l >= r)
            return;

        int m = l + (r - l) / 2;

        sort(a, l, m);
        sort(a, m + 1, r);
        merge(a, l, m, r);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        sort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}