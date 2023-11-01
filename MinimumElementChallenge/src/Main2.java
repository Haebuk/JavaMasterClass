import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int n = readInteger();
        int[] arr = readElements(n);
        System.out.println("min = " + findMin(arr));
    }

    private static int readInteger() {

        Scanner s = new Scanner(System.in);
        System.out.println("how many numbers you enter:");
        String numbers = s.nextLine();

        return Integer.parseInt(numbers.trim());
    }

    private static int[] readElements(int n) {

        Scanner s = new Scanner(System.in);
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number:");
            inputArray[i] = Integer.parseInt(s.nextLine().trim());
        }

        return inputArray;
    }

    private static int findMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i: arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
