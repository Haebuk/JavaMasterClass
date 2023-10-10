public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        numberToWords(1);
        numberToWords(123);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int nDigits = getDigitCount(number);
        int reversed = reverse(number);
        int diffDigits = nDigits - getDigitCount(reversed);
//        System.out.println(diffDigits);



        while (reversed > 0) {
            String n = "";
            switch (reversed % 10) {
                case 0:
                    n = "Zero";
                    break;
                case 1:
                    n = "One";
                    break;
                case 2:
                    n = "Two";
                    break;
                case 3:
                    n = "Three";
                    break;
                case 4:
                    n = "Four";
                    break;
                case 5:
                    n = "Five";
                    break;
                case 6:
                    n = "Six";
                    break;
                case 7:
                    n = "Seven";
                    break;
                case 8:
                    n = "Eight";
                    break;
                case 9:
                    n = "Nine";
                    break;
            }
            System.out.println(n);
            reversed /= 10;
        }
        for (int i = diffDigits; i > 0; i--) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int result = 0;
        while (number > 0) {
            result++;
            number /= 10;
        }

        return result;
    }

    public static int reverse(int number) {

        int result = 0;

        result += number % 10;
        number /= 10;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
