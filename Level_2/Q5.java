import java.util.Scanner;

public class Q5 {
    static String type(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char)(c + 32);

        if (c < 'a' || c > 'z')
            return "Not a Letter";

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return "Vowel";

        return "Consonant";
    }

    static int[] count(String s) {
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            String t = type(s.charAt(i));

            if (t.equals("Vowel"))
                v++;
            else if (t.equals("Consonant"))
                c++;
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        int[] r = count(t);

        System.out.println("Vowels = " + r[0]);
        System.out.println("Consonants = " + r[1]);
    }
}