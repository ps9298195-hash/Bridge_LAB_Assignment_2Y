import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 1) {
            System.out.println("Invalid number");
            return;
        }

        int z = n / 2 + 1;
        int[] e = new int[z];
        int[] o = new int[z];
        int ei = 0, oi = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                e[ei++] = i;
            else
                o[oi++] = i;
        }

        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++)
            System.out.print(o[i] + " ");

        System.out.print("\nEven: ");
        for (int i = 0; i < ei; i++)
            System.out.print(e[i] + " ");
    }
}