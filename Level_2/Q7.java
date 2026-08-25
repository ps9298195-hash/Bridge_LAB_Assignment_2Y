import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[][] p = new double[n][3];
        String[] st = new String[n];

        for (int i = 0; i < n; i++) {
            double w = s.nextDouble();
            double h = s.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }

            p[i][0] = h;
            p[i][1] = w;
            p[i][2] = w / (h * h);

            if (p[i][2] <= 18.4)
                st[i] = "Underweight";
            else if (p[i][2] <= 24.9)
                st[i] = "Normal";
            else if (p[i][2] <= 39.9)
                st[i] = "Overweight";
            else
                st[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Height = " + p[i][0]);
            System.out.println("Weight = " + p[i][1]);
            System.out.println("BMI = " + p[i][2]);
            System.out.println("Status = " + st[i]);
        }
    }
}