package task11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Efim", 5));
        students.add(new Student("Sefer", 3));
        students.add(new Student("Anton", 5));
        students.add(new Student("Dima", 4));

        List<String> list = students.stream()
                .filter(x -> x.getGrade() == 5)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
