public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int heightInches) {
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        int feetToInches = heightFeet * 12;
        int totalInches = feetToInches + heightInches;
        double result = convertToCentimeters(totalInches);
        return result;
    }

    public static double inchesToCentimeters(int a) {
        return a * 2.54;
    }
}
