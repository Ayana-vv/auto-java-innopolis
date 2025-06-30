package org.example.Lesson6;

public class MicrosoftL6 {
    public static void main(String[] args) {
        EmployerL6 mark = new EmployerL6("Mark", "Jonson", 35, "mark@ya.ru", 15000);
//        mark.setSalary(1.5);

//        double markSalary = mark.getSalary();
//        mark.setName("");
//        System.out.println("Имя: " + mark.getName());
//        System.out.println(markSalary);
        Notifier notifier = new SmsNotifier();
        notifier.send("Поздравляю, вас", mark);
        notifier.send("Ваша зп равна: " + mark.getSalary(), mark);

        SmsNotifier smsNotifier = new SmsNotifier();
        smsNotifier.send("Поздравляю, вас", mark);
        smsNotifier.send("Ваша зп равна: " + mark.getSalary(), mark);
    }
}
