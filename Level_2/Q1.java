import java.util.Scanner;

public class Q1 {
    static int len(String s) {
        int n = 0;

        while (true) {
            try {
                s.charAt(n);
                n++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.next();

        System.out.println("User Length = " + len(t));
        System.out.println("Built-in Length = " + t.length());
    }
}