package homeworks.Attestation1.N1;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        //Ввод длины забора
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину забора:");
        int length = scanner.nextInt();

        //Количество букв и пробелов
        int letter = 15;                  // 15 букв
        int space = 3;                    // 3 пробела
        int letters = letter / 3;         //  общее кол-во букв на 3
        int lengthLetter = letters * 62;  // потраченная длина букв 5*62=310
        int lengthSpace = space * 12;     // потраченная длина пробелов 3*12=36

        int lengthMessage = lengthLetter + lengthSpace;  // общая длина 346

        // проверка длины
        if (length > lengthMessage) {                              //если введённая длина забора больше
            System.out.println("Признание не поместится...");      //то вывести сообщение
        }
        else {
            System.out.println("Признание успешно поместится.");   //иначе вывод этого сообщения
        }
        scanner.close();
    }
}
