package homeworks.Number4_L5;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("Введите пароль: ");
        String password = new Scanner(System.in).nextLine();

        int length = password.length();                                     //объявление параметра для расчета длины
        if (length < 9) {                                                   //проверка длины
            System.out.println("Ошибка: у пароля менее 8 символов");
        }
        else if (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4")       //проверка содержания цифр (видела через регулярку можно, но тк не проходили и было с ошибками, поэтому перебрала через if)
                || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8")
                || password.contains("9") || password.contains("0")) {
                if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$")    //проверка содержания спец.символов
                        || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*")
                        || password.contains("№")) {
                    System.out.println("Пароль принят");
                }
                else {
                    System.out.println("Ошибка: пароль должен содержать минимум 1 спец.символ");
                }
        }
        else {
            System.out.println("Ошибка: пароль должен содержать минимум 1 цифру");
        }
    }
}
