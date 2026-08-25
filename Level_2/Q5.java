import java.util.Scanner;

public class Q5 {
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
        int[] r = new int[c];

        for (int i = 0; i < c; i++) {
            a[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < c; i++)
            r[i] = a[c - 1 - i];

        System.out.print("Reverse = ");

        for (int i = 0; i < r.length; i++)
            System.out.print(r[i]);

    }
}