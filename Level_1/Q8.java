import java.util.Scanner;

public class Q8 {
    static void gen(String[] a) {
        System.out.println(a[a.length]);
    }

    static void handle(String[] a) {
        try {
            System.out.println(a[a.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] a = new String[3];

        for (int i = 0; i < a.length; i++)
            a[i] = s.next();

        handle(a);
    }
}