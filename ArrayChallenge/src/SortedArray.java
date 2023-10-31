import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

        int[] inputArray = getIntegers(5);
        System.out.println(Arrays.toString(inputArray));
        printArray(inputArray);
        int[] sortedArray = sortIntegers(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + size + " integer values:\r");
            inputArray[i] = Integer.parseInt(scanner.nextLine());
        }
        return inputArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
