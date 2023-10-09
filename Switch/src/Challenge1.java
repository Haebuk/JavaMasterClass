public class Challenge1 {
    public static void main(String[] args) {
        System.out.println(convertNato('A'));
        System.out.println(convertNato('B'));
        System.out.println(convertNato('C'));
        System.out.println(convertNato('D'));
        System.out.println(convertNato('E'));
        System.out.println(convertNato('X'));
    }

    public static String convertNato(char a) {
        switch (a) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
        }
        return "the letter not found";
    }
}
