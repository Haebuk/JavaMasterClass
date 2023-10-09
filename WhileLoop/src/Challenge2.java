public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(sumDigits(125)); // 8
        System.out.println(sumDigits(1000)); // 1
        System.out.println(sumDigits(7)); // 7

    }

    public static int sumDigits(int n) {
        if (n < 0) {
            return -1;
        }

        int result = 0;
        int multiplier = 10;

        while (n > 0) {
            int lastDigit = n % multiplier;
            n /= multiplier;
            result += lastDigit;
        }


        return result;
    }

}
