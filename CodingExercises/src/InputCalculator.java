import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        int sum = 0;
        int count = 0;

        while (isValid) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                isValid = false;
            }
        }

        long avg = Math.round((float) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
