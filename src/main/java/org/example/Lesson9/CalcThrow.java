package org.example.Lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcThrow {
    public static void main(String[] args) {

        try {
            div();
        } catch (InputMismatchException e) {
            System.out.println("Нельзя вводить строки");
        }
    }

    public static void div() throws InputMismatchException {
        System.out.println("Что делим?");
        int input = new Scanner(System.in).nextInt();
        System.out.println("На что делим?");
        int input2 = new Scanner(System.in).nextInt();

        int result = input/input2;
        System.out.println(result);

        System.out.println("Вы ввели неправильные данные");

        System.out.println("Нельзя делить на ноль");
    }
}
//InputMismatchException
//ArithmeticException
