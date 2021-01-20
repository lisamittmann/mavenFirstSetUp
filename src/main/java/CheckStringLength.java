public class CheckStringLength {

    public static void main (String[] args) {
        String testString = "Kekse";

        System.out.println("String longer than 20 characters: " + stringLength(testString));
    }

    public static boolean stringLength(String s) {
        return s.length() > 20;
    }
}
