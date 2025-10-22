package org.example.Lesson11;

public class Moderator extends BaseUser {
    public Moderator(int id, String name) {
        super(id, name);  //выполняет конструктор родителя
        System.out.println("Создан модератор");
    }

    @Override
    public void auth(String login, String password) {
        System.out.println("Вводим логин");
        System.out.println("Вводим пароль");
        System.out.println("Модератор вошел в систему");
    }
//    private int id;
//
//    private String name;
//
//    public Moderator(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void sendMessage(String message) {
//        System.out.println("Пользователь " + this.name + " отправил сообщение: \"" + message + "\"");
//    }

    public void ban(String name) {
        System.out.println("User " + name + " забанен (by " + this.name + ")");
    }
}
