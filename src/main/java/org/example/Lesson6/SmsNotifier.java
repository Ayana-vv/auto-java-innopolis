package org.example.Lesson6;

public class SmsNotifier implements Notifier {
    public void send(String text, EmployerL6 employerL6) {
        if (auth(employerL6)) {
            System.out.println("Добрый день! " + employerL6.getName());
            System.out.println(text);
        }
    }

    public boolean auth(EmployerL6 employerL6) {
        return !employerL6.getName().isEmpty();
    }
}
