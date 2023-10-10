public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = bigCount; i > 0; i--) {
            if (goal < 5) {
                break;
            }
            goal -= 5;
            if (goal == 0) {
                return true;
            }
        }

        return (smallCount >= goal) && (goal > 0);
    }
}
