package homeworks.Number4_L5.AboutCar;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Car car = new Car("toyota prius", "black", 226, 2019);      //создание экземпляра класса
        System.out.println("Скорость по-умолчанию: " + car.getCurrentSpeed());               //вывод на экран скорости по-умолчанию
        car.speedUp(25);                                                      //увеличение скорости на 25
        car.breakSpeed(25);                                                   //уменьшение скорости на 10
        car.breakSpeed(15);                                                   //уменьшение скорости ещё на 10
        car.breakSpeed(5);                                                    //уменьшение скорости до 0
    }
}
