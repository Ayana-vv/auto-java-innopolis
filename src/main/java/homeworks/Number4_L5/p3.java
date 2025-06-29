package homeworks.Number4_L5;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        //проверка на чётность/нечётность
        int result0 = number % 2;
        //деление на 4 и 3 без остатка
        int result1 = number % 4;
        int result2 = number % 3;
        if (result0 == 0) {                                                           //условие чётного числа
            if (result1 == 0) {                                                       //если при делении на 4 вышло 0 в остатке, то true
                System.out.println(number + " - чётное число, кратно четырем");       //вывод заданного числа
            }
            else {
                System.out.println(number + " - число не подходит под условия задачи");   //вывод, если условия не подходят
            }
        }
        else {                                                                        //если число нечётное
            if (result2 == 0) {                                                       //если при делении на 3 вышло 0 в остатке, то true
                System.out.println(number + " - нечётное число, кратно трем");        //вывод заданного числа
            }
            else {
                System.out.println(number + " - число не подходит под условия задачи");   //вывод, если условия не подходят
            }
        }
    }
}
