import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        double[][] m = new double[n][3];
        double[] p = new double[n];
        char[] g = new char[n];

        for (int i = 0; i < n; i++) {
            m[i][0] = s.nextDouble();
            m[i][1] = s.nextDouble();
            m[i][2] = s.nextDouble();

            if (m[i][0] < 0 || m[i][1] < 0 || m[i][2] < 0) {
                System.out.println("Invalid marks");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            p[i] = (m[i][0] + m[i][1] + m[i][2]) / 3;

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

        for (int i = 0; i < n; i++) {
            System.out.println("Physics = " + m[i][0]);
            System.out.println("Chemistry = " + m[i][1]);
            System.out.println("Maths = " + m[i][2]);
            System.out.println("Percentage = " + p[i]);
            System.out.println("Grade = " + g[i]);
        }
    }
}