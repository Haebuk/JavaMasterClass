public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 23));
        System.out.println(hasSameLastDigit(41, 22, 32));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int ra = a % 10, rb = b % 10, rc = c % 10;

        return ra == rb || ra == rc || rb == rc;
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }
}
