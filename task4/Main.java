package task4;

public class Main {
    public static void main(String[] args) {
        var user = new User("Efim", "Efimov", 20);
        String str = new String("Hello");

        System.out.println(user.hashCode());
        System.out.println(user.toString());
        System.out.println(user.equals(str));
    }
}
