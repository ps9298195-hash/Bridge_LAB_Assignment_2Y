public class Q4 {
    public static void main(String[] args) {
        int n = 1000000;

        long a = System.nanoTime();

        StringBuilder b = new StringBuilder();

        for (int i = 0; i < n; i++)
            b.append("hello");

        long b1 = System.nanoTime();

        StringBuffer f = new StringBuffer();

        for (int i = 0; i < n; i++)
            f.append("hello");

        long b2 = System.nanoTime();

        System.out.println("StringBuilder = " + (b1 - a) + " ns");
        System.out.println("StringBuffer = " + (b2 - b1) + " ns");
    }
}