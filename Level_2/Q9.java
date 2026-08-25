import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[][] m = new double[n][3];
        double[] p = new double[n];
        char[] g = new char[n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = s.nextDouble();

                if (m[i][j] < 0) {
                    System.out.println("Invalid marks");
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            double t = 0;

            for (int j = 0; j < m[i].length; j++)
                t += m[i][j];

            p[i] = t / 3;

            if (p[i] >= 80)
                g[i] = 'A';
            else if (p[i] >= 70)
                g[i] = 'B';
            else if (p[i] >= 60)
                g[i] = 'C';
            else if (p[i] >= 50)
                g[i] = 'D';
            else if (p[i] >= 40)
                g[i] = 'E';
            else
                g[i] = 'R';
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println("Physics = " + m[i][0]);
            System.out.println("Chemistry = " + m[i][1]);
            System.out.println("Maths = " + m[i][2]);
            System.out.println("Percentage = " + p[i]);
            System.out.println("Grade = " + g[i]);
        }
    }
}