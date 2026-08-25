import java.util.Scanner;

public class Q8 {
    static boolean ana(String a, String b) {
        if (a.length() != b.length())
            return false;

        int[] x = new int[256];
        int[] y = new int[256];

        for (int i = 0; i < a.length(); i++) {
            x[a.charAt(i)]++;
            y[b.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (x[i] != y[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        System.out.println("Anagram = " + ana(a, b));
    }
}