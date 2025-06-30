package org.example.Lesson6;

public class Notify {
    public static void main(String[] args) {
        EmployerL6 mark = new EmployerL6("Mark", "Jonson", 35, "mark@ya.ru", 15000);

        int[] array = {1,2,3};

        Notifier[] notifiers = {new EmailNotifier(), new SmsNotifier()};

        for (int i = 0; i < notifiers.length; i++) {
            Notifier notifier = notifiers[1];
            notifier.send("Поздравляю, вас", mark);
            notifier.send("Ваша зп равна: " + mark.getSalary(), mark);
        }
    }
}
