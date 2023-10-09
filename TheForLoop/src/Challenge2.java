public class Challenge2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count += 1;
                System.out.println("i: " + i + ", sum: " + sum);
            }

            if (count == 5) {
                break;
            }
        }
    }
}
