package org.example.Lesson6;

public class EmployerL6 {
    private String name;
    private String surname;
    private int age;
    private String email;
    private double salary;

    public EmployerL6(String name, String surname, int age, String email, double salary) {
        this.name = name;
        this.surname = surname;
        if (age < 100 && age > 12) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.email = email;
        this.salary = salary;
    }

    public void setSalary(double coefficient) {
        if (coefficient > 1.1 && coefficient < 2) {
            salary = salary * 1.5;
        }
        else {
            System.out.println("Недопустимая сумма");
        }
    }
    public double getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
        }
        else {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
