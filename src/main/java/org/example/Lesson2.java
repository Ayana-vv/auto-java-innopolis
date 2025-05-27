package org.example;

public class Lesson2 {
    public static void main(String[] arg){
        var balance = 100;
        System.out.println(balance);
        balance = 1000;
        System.out.println(balance);


        System.out.println("hello mir!");
        System.out.println("\'test\'"); //тестовые выводы
        System.out.println("bye\neveryone");

        int x = 2;
        int y = 3;
        System.out.println("x=" + x + "; y=" +y); //вывод х и y
        System.out.println("x+" + x); //вывод х
        System.out.printf("x=%d; \ny=%d\n", x, y); //вывод x и y +перенос строки

        double d = 2.12;
        float f = 0.78f; //не забыть про f в конце
        System.out.println(d/f); //ответ 2.7179488176424864
        System.out.println(d*f); //ответ 1.6535999393463137
        System.out.println(f*d); //ответ 1.6535999393463137

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);

        String name = "Аяна";
        String name1 = name.toLowerCase();
        System.out.println(name1);

    }
}
