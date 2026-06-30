package task9;

import java.util.ArrayList;
import java.util.List;

public class RealizationOfComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Efim");
        list.add("Egg");
        list.add("Elephant");

        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(list);
    }
}
