package homeworks.Number4_L5;

public class p5 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {                 //цикл цифр от 1 до 100
            if ((i % 3 == 0) && (i % 5 == 0)) {         //проверка кратности и на 3, и на 5
                System.out.println("FizzBuzz");
            }
            else {
                    if (i % 3 == 0) {                   //проверка кратности на 3
                        System.out.println("Fizz");
                    }
                    else if (i % 5 == 0) {              //проверка кратности на 5
                        System.out.println("Buzz");
                    }
                    else {
                        System.out.println(i);          //вывод всех чисел до 100
                    }
            }
        }
    }
}
