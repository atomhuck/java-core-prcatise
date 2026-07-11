package task12;

import java.util.ArrayList;
import java.util.List;

public class OptionalPractice {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Efim", 0));
        list.add(new User("Dasha", 1));
        list.add(new User("Anton", 2));
        list.add(null);

        System.out.println(User.findById(3, list).orElse(new User("Defolt", 66)).getName());
        System.out.println(User.findById(3, list).orElseThrow(() -> new RuntimeException("Такого пользователя сущетсвует")));
    }
}
