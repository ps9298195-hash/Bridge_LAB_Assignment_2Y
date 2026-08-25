import java.util.Scanner;
import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = 10;
        int[] f = new int[m];
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (k == m) {
                    m *= 2;
                    f = Arrays.copyOf(f, m);
                }
                f[k++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < k; i++)
            System.out.print(f[i] + " ");
    }
}