import java.util.Scanner;

public class Q14 {
    static int first(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == x) {
                ans = m;
                r = m - 1;
            } else if (a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    static int last(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;
        int ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (a[m] == x) {
                ans = m;
                l = m + 1;
            } else if (a[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        int x = s.nextInt();

        System.out.println("First = " + first(a, x));
        System.out.println("Last = " + last(a, x));
    }
}