import java.util.Scanner;

public class Q3 {
    static String con(String[] a) {
        StringBuffer b = new StringBuffer();

        for (int i = 0; i < a.length; i++)
            b.append(a[i]);

        return b.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < a.length; i++)
            a[i] = s.next();

        System.out.println(con(a));
    }
}