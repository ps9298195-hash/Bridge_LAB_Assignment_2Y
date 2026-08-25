import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] a = new double[10];
        double t = 0;
        int i = 0;

        while (true) {
            double n = s.nextDouble();

            if (n <= 0 || i == 10)
                break;

            a[i++] = n;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(a[j]);
            t += a[j];
        }

        System.out.println("Sum = " + t);
    }
}