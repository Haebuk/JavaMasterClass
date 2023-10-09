public class Challenge1 {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("7 is " + (isPrime(7) ? "" : "NOT ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");

        int count = 0;
        for (int i = 777; i <= 1000; i++) {

            if (isPrime(i)) {
                count++;
                System.out.println("i: " + i + ", count: " + count);

            }

            if (count == 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
