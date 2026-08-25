import java.util.Scanner;

public class Quick_Sort {
    static int part(int[] a, int l, int r) {
        int p = a[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] <= p) {
                i++;

                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[r];
        a[r] = t;

        return i + 1;
    }

    static void sort(int[] a, int l, int r) {
        if (l < r) {
            int p = part(a, l, r);

            sort(a, l, p - 1);
            sort(a, p + 1, r);
        }
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