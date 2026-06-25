package task7;

import java.util.ArrayList;

public class ArayPractice {
    public static void main(String[] args) {
        var toDoList = new ArrayList<String>();

        toDoList.add("Помыть посуду");
        toDoList.add("Clean the car");
        toDoList.add("Clean the roof");
        toDoList.add("Clean the boots");
        toDoList.add("Clean the desk");

        toDoList.remove(1);
        for (String task : toDoList){
            System.out.println(task);
        }
    }
}
