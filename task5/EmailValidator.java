package task5;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private static boolean isValid(String email){
        if (email == null) return false;
        return Pattern.matches(EMAIL_REGEX, email);
    }
    public static void registerEmail (String email){
        if (!EmailValidator.isValid(email))
            throw new InvalidEmailException("Ошибка регистрации, ваша почта имеет неправильный формат " + email);

        System.out.println("Все отлично, регистрация прошла успешна");
    }
}
