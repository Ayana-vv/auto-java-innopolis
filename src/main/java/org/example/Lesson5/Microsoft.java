package org.example.Lesson5;

public class Microsoft {
    public static void main(String[] args) {
        Employer mark = new Employer("Mark", "Jonson", 35, "mark@ya.ru", 15000);
//        System.out.println(mark.salary);
        mark.setSalary(1.5);
//        mark.salary = mark.salary * 100;
//        System.out.println(mark.salary);

        double markSalary = mark.getSalary();
        System.out.println(markSalary);
    }
}
