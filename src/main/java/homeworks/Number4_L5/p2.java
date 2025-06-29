package homeworks.Number4_L5;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        //деление на 2
        int result = number % 2;
        if (result == 0) {                                      //условие деления: если 0 в остатке, то true
            System.out.println(number + " - чётное число");     //вывод заданного числа
        }
        else {                                                  //если 1 в остатке, то false
            System.out.println(number + " - нечётное число");   //вывод заданного числа
        }
    }
}
