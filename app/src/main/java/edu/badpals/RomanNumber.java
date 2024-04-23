package edu.badpals;

public class RomanNumber {
    private final String romanNumber;
    private int decimalNumber;

    public static String REGEXRESTA="I(?=[XV])|X(?=[LC])|C(?=[DM])";

    public static String REGEXILEGAL="IIII|VVVV|XXXX|LLLL|CCCC|DDDD|MMMM";

    public RomanNumber(String numeroRomano) {
        this.romanNumber = numeroRomano;
        this.decimalNumber = decimalNumber;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public int toDecimal() {
        if()
    }
}
