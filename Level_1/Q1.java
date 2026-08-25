import java.util.Scanner;

public class Q1 {
    static boolean cmp(String a, String b) {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        boolean x = cmp(a, b);
        boolean y = a.equals(b);

        System.out.println("charAt: " + x);
        System.out.println("equals: " + y);
        System.out.println("Same: " + (x == y));
    }
}