import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }

        int t = n;
        int c = 0;

        if (t == 0)
            c = 1;

        while (t > 0) {
            c++;
            t /= 10;
        }

        int[] a = new int[c];
        int[] f = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < a.length; i++)
            f[a[i]]++;

        for (int i = 0; i < f.length; i++)
            System.out.println(i + " = " + f[i]);
    }
}