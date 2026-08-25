import java.util.Scanner;

public class Q10 {
    static double[][] marks(int n) {
        double[][] a = new double[n][3];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int)(Math.random() * 90) + 10;

        return a;
    }

    static double[][] calc(double[][] a) {
        double[][] r = new double[a.length][3];

        for (int i = 0; i < a.length; i++) {
            double t = a[i][0] + a[i][1] + a[i][2];
            double av = t / 3;
            double p = t / 300 * 100;

            r[i][0] = Math.round(t * 100.0) / 100.0;
            r[i][1] = Math.round(av * 100.0) / 100.0;
            r[i][2] = Math.round(p * 100.0) / 100.0;
        }

        return r;
    }

    static String[][] grade(double[][] a) {
        String[][] r = new String[a.length][1];

        for (int i = 0; i < a.length; i++) {
            double p = a[i][2];

            if (p >= 80)
                r[i][0] = "A";
            else if (p >= 70)
                r[i][0] = "B";
            else if (p >= 60)
                r[i][0] = "C";
            else if (p >= 50)
                r[i][0] = "D";
            else if (p >= 40)
                r[i][0] = "E";
            else
                r[i][0] = "R";
        }

        return r;
    }

    static void show(double[][] m, double[][] r, String[][] g) {
        System.out.println("P\tC\tM\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < m.length; i++) {
            System.out.println(
                m[i][0] + "\t" +
                m[i][1] + "\t" +
                m[i][2] + "\t" +
                r[i][0] + "\t" +
                r[i][1] + "\t" +
                r[i][2] + "\t\t" +
                g[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[][] m = marks(n);
        double[][] r = calc(m);
        String[][] g = grade(r);

        show(m, r, g);
    }
}