package task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list = list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(list);
    }
}
