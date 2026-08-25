import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        for (int i = 0; i < a.length - 1; i++) {
            int mi = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[mi])
                    mi = j;
            }

            int t = a[i];
            a[i] = a[mi];
            a[mi] = t;
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}