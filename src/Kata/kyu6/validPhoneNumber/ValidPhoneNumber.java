package Kata.kyu6.validPhoneNumber;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^[(]{1}[0-9]{3}[)]{1} [0-9]{3}[-]{1}[0-9]{4}$");
    }
}
