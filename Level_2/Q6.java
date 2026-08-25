import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[] w = new double[n];
        double[] h = new double[n];
        double[] b = new double[n];
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            w[i] = s.nextDouble();
            h[i] = s.nextDouble();

            if (w[i] <= 0 || h[i] <= 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            b[i] = w[i] / (h[i] * h[i]);

            if (b[i] <= 18.4)
                st[i] = "Underweight";
            else if (b[i] <= 24.9)
                st[i] = "Normal";
            else if (b[i] <= 39.9)
                st[i] = "Overweight";
            else
                st[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height = " + h[i]);
            System.out.println("Weight = " + w[i]);
            System.out.println("BMI = " + b[i]);
            System.out.println("Status = " + st[i]);
        }
    }
}