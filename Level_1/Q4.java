public class Q4 {
    static void gen() {
        String t = null;
        System.out.println(t.length());
    }

    static void handle() {
        String t = null;

        try {
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}