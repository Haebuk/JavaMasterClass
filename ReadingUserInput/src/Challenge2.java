import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        while (isValid) {
            try {
                System.out.println("Enter the number:");
                double input = Double.parseDouble(scanner.nextLine());
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            } catch (NumberFormatException e) {
                isValid = false;
            }
        }
        System.out.println("max: " + max + ", min: " + min);
    }
}
