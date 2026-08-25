import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] a = new int[3];
        double[] h = new double[3];

        for (int i = 0; i < 3; i++) {
            a[i] = s.nextInt();
            h[i] = s.nextDouble();
        }

        int yi = 0, ti = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[yi])
                yi = i;

            if (h[i] > h[ti])
                ti = i;
        }

        System.out.println("Youngest = " + n[yi]);
        System.out.println("Tallest = " + n[ti]);
    }
}