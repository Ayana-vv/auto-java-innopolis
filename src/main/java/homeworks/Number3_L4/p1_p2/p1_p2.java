package homeworks.Number3_L4.p1_p2;

public class p1_p2 {
    public static void main(String[] args) {
        //массив строк
        String[] todoList = {"проснуться", "умыться", "покушать", "посмотреть сериалы", "пойти по делам"};
        //вывод всех дел
        System.out.println("Список дел на день:");
        System.out.println(todoList[0]);
        System.out.println(todoList[1]);
        System.out.println(todoList[2]);
        System.out.println(todoList[3]);
        System.out.println(todoList[4]);

        //массив чисел
        float[] numbers = new float[3];
        numbers[0] = 3.14159f;  //число Пи
        numbers[1] = 2.71828f;  //число е
        numbers[2] = 1;         //число 1
        //вывод чисел
        System.out.println("Вывод чисел: " + "число Пи - " + numbers[0] + ", число е - " + numbers[1] + ", число 1 - " + numbers[2]);
        //System.out.println(numbers[1]);  //вывод сделала для себя для проверки
    }
}
