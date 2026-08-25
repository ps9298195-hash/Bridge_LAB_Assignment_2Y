import java.util.Scanner;

public class Q5 {
    static void gen(String s) {
        System.out.println(s.charAt(s.length()));
    }

    static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.next();

        handle(t);
    }
}