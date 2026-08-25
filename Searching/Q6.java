import java.io.*;
import java.util.Scanner;

public class Q6 {
    static int count(String f, String x) throws IOException {
        FileReader r = new FileReader(f);
        BufferedReader b = new BufferedReader(r);

        int c = 0;
        String l;

        while ((l = b.readLine()) != null) {
            String[] a = l.split("\\s+");

            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(x))
                    c++;
            }
        }

        b.close();
        return c;
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        String f = s.nextLine();
        String x = s.next();

        System.out.println(count(f, x));
    }
}