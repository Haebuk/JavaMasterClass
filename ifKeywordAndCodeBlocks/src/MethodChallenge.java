public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Kade", calculateHighScorePosition(1500));
        displayHighScorePosition("Kade", calculateHighScorePosition(1000));
        displayHighScorePosition("Kade", calculateHighScorePosition(500));
        displayHighScorePosition("Kade", calculateHighScorePosition(100));
        displayHighScorePosition("Kade", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;
    }
}
