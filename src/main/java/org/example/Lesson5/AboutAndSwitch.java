package org.example.Lesson5;

import java.util.Scanner;

public class AboutAndSwitch {

    public static void main(String[] args) {
        double price = 100;
        String promoCode = new Scanner(System.in).nextLine();

//        if (promoCode.equals("Cyber monday")) {
//            price = price * 0.85;
//        }
//        else if (promoCode.equals("black-friday")) {
//            price = price * 0.5;
//        }
//        else if (promoCode.equals("cool")) {
//            price = price * 0.1;
//        }
//        else {
//            System.out.println("Такого промокода не существует. Введите актуальный!");
//        }
        switch (promoCode) {
            case "Cyber monday" :
                price = price * 0.85;
                break;
            case "black-friday" :
                price = price * 0.5;
                break;
            case "cool" :
                price = price * 0.1;
                break;
            default :
                System.out.println("Такого промокода не существует. Введите актуальный!");
        }

        System.out.println("Итоговая цена: " + price);
    }
}
