package org.example.Lesson6;

public class PrimAndRef {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        x = y;
        x++;

        System.out.println(x);
        System.out.println(y);

        EmployerL6 mark = new EmployerL6("Mark", "Jonson", 35, "mark@ya.ru", 15000);
        EmployerL6 rm = new EmployerL6("RM", "Kim", 29, "rm@ya.ru", 20000);
        mark = rm;
        mark.setName("НеМарк");

        System.out.println(mark.getName());
        System.out.println(rm.getName());


    }
}
