package homeworks.Number4_L5;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int balance = new Scanner(System.in).nextInt();  //создание и ввод переменной
        //сравнение переменной
        if (balance == 10) {
            System.out.println("Десятка");      //если условие true, то вывод этой строки
        }
        //else закомментировала, т.к. в задании только про if
//        else {
//            System.out.println("Повторите попытку"); //если условие false, то вывод этой строки
//        }
    }
}
