import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] sal = new double[10];
        double[] yos = new double[10];
        double[] bon = new double[10];
        double[] ns = new double[10];

        int i = 0;
        double tb = 0, ts = 0, tn = 0;

        while (i < sal.length) {
            double x = s.nextDouble();
            double y = s.nextDouble();

            if (x <= 0 || y < 0) {
                System.out.println("Invalid input");
                continue;
            }

            sal[i] = x;
            yos[i] = y;
            i++;
        }

        for (i = 0; i < sal.length; i++) {
            if (yos[i] > 5)
                bon[i] = sal[i] * 0.05;
            else
                bon[i] = sal[i] * 0.02;

            ns[i] = sal[i] + bon[i];

            tb += bon[i];
            ts += sal[i];
            tn += ns[i];
        }

        System.out.println("Total Old Salary = " + ts);
        System.out.println("Total Bonus = " + tb);
        System.out.println("Total New Salary = " + tn);
    }
}