import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] h = new double[11];
        double sum = 0;

        for (int i = 0; i < h.length; i++) {
            h[i] = s.nextDouble();
            sum += h[i];
        }

        double m = sum / h.length;
        System.out.println("Mean height = " + m);
    }
}