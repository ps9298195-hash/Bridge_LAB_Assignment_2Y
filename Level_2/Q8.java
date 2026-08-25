public class Q8 {
    static int[] age(int n) {
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = (int)(Math.random() * 90) + 10;

        return a;
    }

    static String[][] vote(int[] a) {
        String[][] r = new String[a.length][2];

        for (int i = 0; i < a.length; i++) {
            r[i][0] = String.valueOf(a[i]);
            r[i][1] = a[i] >= 18 ? "true" : "false";
        }

        return r;
    }

    static void show(String[][] a) {
        System.out.println("Age\tCan Vote");

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }

    public static void main(String[] args) {
        int[] a = age(10);
        String[][] r = vote(a);

        show(r);
    }
}