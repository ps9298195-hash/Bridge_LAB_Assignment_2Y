import java.io.*;

public class Q5 {
    static void read(String f) throws IOException {
        FileReader r = new FileReader(f);
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