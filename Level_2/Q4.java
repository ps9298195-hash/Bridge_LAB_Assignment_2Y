import java.util.Scanner;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }

        int m = 10;
        int[] a = new int[m];
        int i = 0;

        while (n > 0) {
            if (i == m) {
                m += 10;
                a = Arrays.copyOf(a, m);
            }

            a[i++] = n % 10;
            n /= 10;
        }

        int l = 0, sl = 0;

        for (int j = 0; j < i; j++) {
            if (a[j] > l) {
                sl = l;
                l = a[j];
            } else if (a[j] > sl && a[j] != l) {
                sl = a[j];
            }
        }

        System.out.println("Largest = " + l);
        System.out.println("Second Largest = " + sl);
    }
}