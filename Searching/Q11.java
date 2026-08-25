import java.util.Scanner;

public class Q11 {
    static int find(int[] a) {
        int l = 0;
        int r = a.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (a[m] > a[r])
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

        System.out.println("Index = " + find(a));
        System.out.println("Value = " + a[find(a)]);
    }
}