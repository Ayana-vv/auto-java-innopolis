package homeworks.Number2_L3.p1;

public class Task1 {
    public static void main(String[] args) {
        //задать переменную
        String cardNumber = "1234 5678 9012 3456";  //заданная переменная
        System.out.println(cardNumber.replace("1234 5678 9012", "**** **** ****"));  //преобразование в *
        System.out.println(cardNumber.replace(" ", ""));//удаление пробелов
    }
}
