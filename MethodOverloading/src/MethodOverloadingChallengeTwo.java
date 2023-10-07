public class MethodOverloadingChallengeTwo {
    public static void main(String[] args) {
        System.out.println(getDurationString(240));
        System.out.println(getDurationString(4800));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(30, 59));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, -45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "the seconds should be greater equal than zero";
        }

        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59 || minutes < 0) {
            return "the seconds should be in (0, 59) and minute should be greater equal than zero";
        }
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}
