import java.util.Scanner;

public class Q4 {
    static String[][] freq(String s) {
        int[] f = new int[256];

        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;

        int n = 0;

        for (int i = 0; i < 256; i++) {
            if (f[i] > 0)
                n++;
        }

        String[][] r = new String[n][2];
        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (f[i] > 0) {
                r[k][0] = String.valueOf((char)i);
                r[k][1] = String.valueOf(f[i]);
                k++;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        String[][] r = freq(t);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < r.length; i++)
            System.out.println(r[i][0] + "\t\t" + r[i][1]);
    }
}