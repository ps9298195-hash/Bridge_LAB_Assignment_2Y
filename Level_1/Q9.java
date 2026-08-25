import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = s.nextInt();

        int[] b = new int[r * c];
        int k = 0;

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[k++] = a[i][j];

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}