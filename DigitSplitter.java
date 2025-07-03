public class DigitSplitter {
    public int getFirstDigit(int number) {
        String str = Integer.toString(number);
         return Character.getNumericValue(str.charAt(0));
    }
    public int getSecondDigit(int number) {
        String str = Integer.toString(number);
        return Character.getNumericValue(str.charAt(1));
    }

    public static void main(String[] args) {
        DigitSplitter dig = new DigitSplitter();
        System.out.println("first digit = " + dig.getFirstDigit(15));
        System.out.println("second digit = " + dig.getSecondDigit(15));
    }
}
