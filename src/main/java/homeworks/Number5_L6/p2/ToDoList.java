package homeworks.Number5_L6.p2;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {
        //Список дел
        List<String> toDoList = new ArrayList<>();      //список дел
        toDoList.add("Проснуться");
        toDoList.add("Позавтракать");
        toDoList.add("Поработать");
        toDoList.add("Пойти на прогулку");
        toDoList.add("Почитать");

        //цикл вывода дел
        for (String todo : toDoList) {
            System.out.println("Задача №" + (toDoList.indexOf(todo) + 1) + ": " + todo);
        }
    }

}
