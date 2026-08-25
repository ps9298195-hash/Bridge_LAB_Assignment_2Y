import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[4];

        for (int i = 6; i <= 9; i++)
            a[i - 6] = n * i;

        for (int i = 6; i <= 9; i++)
            System.out.println(n + " * " + i + " = " + a[i - 6]);
    }
}