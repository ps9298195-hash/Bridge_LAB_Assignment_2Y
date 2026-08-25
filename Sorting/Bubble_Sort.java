import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        for (int i = 0; i < a.length - 1; i++) {
            boolean sw = false;

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    sw = true;
                }
            }

            if (!sw)
                break;
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}