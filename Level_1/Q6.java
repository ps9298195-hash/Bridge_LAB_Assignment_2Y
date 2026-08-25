import java.util.Scanner;

public class Q6 {
    static void gen(String s) {
        System.out.println(s.substring(5, 2));
    }

    static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.next();

        handle(t);
    }
}