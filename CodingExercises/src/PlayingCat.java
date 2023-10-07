public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(true, 46));
        System.out.println(isCatPlaying(false, 10));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperTemperature = (summer ? 45 : 35);
        int lowerTemperature = 25;
        return temperature >= lowerTemperature && temperature <= upperTemperature;
    }
}
