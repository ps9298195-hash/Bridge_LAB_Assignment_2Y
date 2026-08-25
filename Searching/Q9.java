import java.util.Scanner;

public class Q9 {
    static int search(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextInt();

        System.out.println(search(a));
    }
}