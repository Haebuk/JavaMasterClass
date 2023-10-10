import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        double sum = 0;
        do {
            System.out.println("Enter number #" + i + ":");
            try {
                double num = Double.parseDouble(scanner.nextLine());
                sum += num;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (i < 6);

        System.out.println("The result of sum is : " + sum);
    }
}
