import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }

        String[] a = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                a[i] = "FizzBuzz";
            else if (i % 3 == 0)
                a[i] = "Fizz";
            else if (i % 5 == 0)
                a[i] = "Buzz";
            else
                a[i] = String.valueOf(i);
        }

        for (int i = 0; i < a.length; i++)
            System.out.println("Position " + (i + 1) + " = " + a[i]);
    }
}