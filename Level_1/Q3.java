import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[10];

        for (int i = 1; i <= 10; i++)
            a[i - 1] = n * i;

        for (int i = 1; i <= 10; i++)
            System.out.println(n + " * " + i + " = " + a[i - 1]);
    }
}