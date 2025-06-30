package org.example.Lesson6;

public interface Notifier {
    void send (String text, EmployerL6 employerL6);

    boolean auth(EmployerL6 employerL6);
}
