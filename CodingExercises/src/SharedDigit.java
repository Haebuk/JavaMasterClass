public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (a > 99) || (b < 10) || (b > 99)) {
            return false;
        }

        while (a > 0) {
            int r1 = a % 10;

            int tb = b;
            while (tb > 0) {
                int r2 = tb % 10;
                if (r1 == r2) {
                    return true;
                }
                tb /= 10;
            }
            a /= 10;
        }
        return false;
    }
}
