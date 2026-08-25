import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();

            if (a[i] > 0) {
                if (a[i] % 2 == 0)
                    System.out.println(a[i] + " is positive and even");
                else
                    System.out.println(a[i] + " is positive and odd");
            } else if (a[i] < 0) {
                System.out.println(a[i] + " is negative");
            } else {
                System.out.println(a[i] + " is zero");
            }
        }

        if (a[0] == a[4])
            System.out.println("First and last elements are equal");
        else if (a[0] > a[4])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");
    }
}