import java.util.Scanner;

public class Counting_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        int[] c = new int[9];

        for (int i = 0; i < a.length; i++)
            c[a[i] - 10]++;

        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];

        int[] o = new int[n];

        for (int i = a.length - 1; i >= 0; i--) {
            o[c[a[i] - 10] - 1] = a[i];
            c[a[i] - 10]--;
        }

        for (int i = 0; i < o.length; i++)
            System.out.print(o[i] + " ");
    }
}