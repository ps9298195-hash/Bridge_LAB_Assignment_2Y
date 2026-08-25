import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = x;
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}