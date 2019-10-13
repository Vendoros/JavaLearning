package Kata.kyu7.validatePin;

public class ValidatePin {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
