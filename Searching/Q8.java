import java.io.*;

public class Q8 {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);
        FileWriter f = new FileWriter("data.txt");

        String l;

        while (true) {
            l = b.readLine();

            if (l.equals("exit"))
                break;

            f.write(l);
            f.write("\n");
        }

        f.close();
    }
}