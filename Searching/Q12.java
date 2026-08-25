import java.util.Scanner;

public class Q12 {
    static int find(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (a[m] < a[m + 1])
                l = m + 1;
            else
                r = m;
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        int i = find(a);

        System.out.println("Index = " + i);
        System.out.println("Peak = " + a[i]);
    }
}