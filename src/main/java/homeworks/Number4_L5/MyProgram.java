package homeworks.Number4_L5;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Card cardVisa = new Card("4276 5555 1111 3456", "12/29", 754, 1196);     //ввод данных карты
        cardVisa.setNumber();                                                                               //вывод шифрованного номера карты

        System.out.println("Введите пин-код карты: ");
        int pinCodeIn = new Scanner(System.in).nextInt();                                                   //ввод пин-кода
        cardVisa.setPinCode(pinCodeIn);                                                                     //вывод результата совпадения пин-кода и номера карты
    }
}