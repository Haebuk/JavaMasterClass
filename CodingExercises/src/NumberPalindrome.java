public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        return reverse == number;
    }
}
