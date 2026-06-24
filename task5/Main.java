package task5;

public class Main {
    public static void main(String[] args) {

        // Test 1
        String email1 = "testgmail.com";
        try{
            EmailValidator.registerEmail(email1);
        } catch (InvalidEmailException e){
            System.out.println("У нас ошибка: " + e.getMessage());
        }

        // Test 2
        String email2 = "test@gmail.com";
        try{
            EmailValidator.registerEmail(email2);
        } catch (InvalidEmailException e){
            System.out.println("У нас ошибка: " + e.getMessage());
        }
    }
}
