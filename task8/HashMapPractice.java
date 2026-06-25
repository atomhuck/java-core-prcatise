package task8;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, String> translation = new HashMap<>();

        translation.put("Hello", "Привет");
        translation.put("Bye", "Пока");
        translation.put("dinner", "ужин");
        translation.put("Okay", "Ладно");
        translation.put("Sun", "Солнце");

        System.out.println(translation.get("Sun"));

        for (Map.Entry<String, String> pairWords : translation.entrySet()){
            System.out.println(String.format("%s переводится как \"%s\"", pairWords.getKey(), pairWords.getValue()));
        }
    }
}
