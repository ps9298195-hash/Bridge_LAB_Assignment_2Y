import java.util.Scanner;

public class Q1 {
    static String[] bmi(double w, double h) {
        double m = h / 100;
        double b = w / (m * m);
        String st;

        if (b < 18.5)
            st = "Underweight";
        else if (b < 25)
            st = "Normal";
        else if (b < 30)
            st = "Overweight";
        else
            st = "Obese";

        return new String[]{String.valueOf(h), String.valueOf(w),
                String.valueOf(b), st};
    }

    static String[][] calc(double[][] a) {
        String[][] r = new String[a.length][4];

        for (int i = 0; i < a.length; i++)
            r[i] = bmi(a[i][0], a[i][1]);

        return r;
    }

    static void show(String[][] a) {
        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1] + "\t" +
                    a[i][2] + "\t" + a[i][3]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] a = new double[10][2];

        for (int i = 0; i < a.length; i++) {
            a[i][0] = s.nextDouble();
            a[i][1] = s.nextDouble();
        }

        String[][] r = calc(a);
        show(r);
    }
}