import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();

            if (a[i] < 0)
                System.out.println("Invalid age");
            else if (a[i] >= 18)
                System.out.println("The student with the age " + a[i] + " can vote.");
            else
                System.out.println("The student with the age " + a[i] + " cannot vote.");
        }
    }
}