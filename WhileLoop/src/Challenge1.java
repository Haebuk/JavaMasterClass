public class Challenge1 {
    public static void main(String[] args) {

        int i = 5;
        int numOfEven = 0, numOfOdd = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i);
                numOfEven++;
            } else {
                numOfOdd++;
            }
            i++;
        }

        System.out.println("---");
        System.out.println(numOfEven);
        System.out.println(numOfOdd);
    }

    public static boolean isEvenNumber(int n) {
        return n % 2 == 0;
    }
}
