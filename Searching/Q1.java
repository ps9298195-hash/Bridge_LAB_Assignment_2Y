import java.util.Scanner;

public class Q1 {
    static String rev(String s) {
        StringBuilder b = new StringBuilder();
        b.append(s);
        return b.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();

        System.out.println(rev(t));
    }
}