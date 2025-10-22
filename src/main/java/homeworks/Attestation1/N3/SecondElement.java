package homeworks.Attestation1.N3;

import java.util.Arrays;

public class SecondElement {
    public static void main(String[] args) {
        //массив чисел
        int[] numbers = {1,5,7,3,2,0,4,9,6};
        //установка минимального значения
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        //вычисление второго по величине числа
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            }
            else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        //вывод второго по величине числа
        System.out.println("Второй по величине элемент:");
        System.out.println(secondMax);
    }
}
