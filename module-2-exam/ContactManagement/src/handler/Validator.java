package handler;

public class Validator {

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidPhoneNumber(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static boolean isValidFacebookURL(String url) {
        return url != null && url.matches("^(https?://)?(www\\.)?facebook\\.com/.+");
    }
}
