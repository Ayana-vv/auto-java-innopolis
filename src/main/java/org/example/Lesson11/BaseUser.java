package org.example.Lesson11;

abstract public class BaseUser {

    protected int id;

    protected String name;

    public BaseUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println("Пользователь " + this.name + " отправил сообщение: \"" + message + "\"");
    }

    abstract public void auth(String login, String password);
}
