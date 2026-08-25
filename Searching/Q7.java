import java.io.*;

public class Q7 {
    static void read(String f) throws IOException {
        FileInputStream i = new FileInputStream(f);
        InputStreamReader r = new InputStreamReader(i, "UTF-8");
        BufferedReader b = new BufferedReader(r);

        String l;

        while ((l = b.readLine()) != null)
            System.out.println(l);

        b.close();
    }

    public static void main(String[] args) throws IOException {
        read("data.txt");
    }
}