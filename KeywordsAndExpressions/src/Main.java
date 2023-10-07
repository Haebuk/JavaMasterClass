public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 100;
        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        // there are 6 expressions below
        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
