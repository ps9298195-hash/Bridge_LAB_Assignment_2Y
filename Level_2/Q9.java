import java.util.Scanner;

public class Q9 {
    static String choice() {
        int n = (int)(Math.random() * 3);

        if (n == 0)
            return "Rock";
        if (n == 1)
            return "Paper";

        return "Scissors";
    }

    static String win(String p, String c) {
        if (p.equals(c))
            return "Draw";

        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper")))
            return "Player";

        return "Computer";
    }

    static double per(int w, int n) {
        return Math.round((w * 100.0 / n) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int pw = 0;
        int cw = 0;

        System.out.println("Game\tPlayer\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Rock, Paper or Scissors:");
            String p = s.next();
            String c = choice();

            String w = win(p, c);

            if (w.equals("Player"))
                pw++;
            else if (w.equals("Computer"))
                cw++;

            System.out.println(i + "\t" + p + "\t" + c + "\t" + w);
        }

        System.out.println("Player Wins = " + pw);
        System.out.println("Computer Wins = " + cw);
        System.out.println("Player Win % = " + per(pw, n));
        System.out.println("Computer Win % = " + per(cw, n));
    }
}