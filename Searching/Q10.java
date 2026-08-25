import java.util.Scanner;

public class Q10 {
    static String search(String[] a, String x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains(x))
                return a[i];
        }

        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String[] a = new String[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.nextLine();

        String x = s.nextLine();

        System.out.println(search(a, x));
    }
}