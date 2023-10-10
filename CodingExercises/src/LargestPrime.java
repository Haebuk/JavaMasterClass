public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int largestPrime = 1;
        for (int i = 2; i <= number; i++) {
            boolean canDivided = false;
            int remainder = number % i;

            if (remainder == 0) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        canDivided = true;
                        break;
                    }
                }
                if (!canDivided) {
                    largestPrime = i;
                }
            }
        }


        return largestPrime;
    }
}
