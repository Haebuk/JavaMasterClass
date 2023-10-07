public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, -3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int ia = (int) (a * 1000);
        int ib = (int) (b * 1000);

        return ia == ib;
    }
}
