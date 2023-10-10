public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(2000));
        System.out.println(getEvenDigitSum(123456789));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int result = 0;
        while (number > 0) {
            int r = number % 10;

            if (r % 2 == 0) {
                result += r;
            }

            number /= 10;
        }

        return result;
    }
}
