package homeworks;

public class Number1 {
    public static void main(String[] args) {
        //заданные переменные
        String character = "Зимний солдат - Баки";

        //возвращает длину строки character
        int result = character.length();
        System.out.println("длина строки - " + result);

        //проверка на пустоту строки emptyCharacter
        String emptyCharacter = "";
        boolean result2 = character.isEmpty();
        System.out.println(result2); //строка character не пустая, поэтому false
        boolean result2Empty = emptyCharacter.isEmpty();
        System.out.println(result2Empty); //строка emptyCharacter пустая, поэтому true

        //проверка на пустоту строк
        String emptyCharacter2 = "  ";
        boolean result3 = character.isEmpty();
        System.out.println(result3); //строка character не пустая(пробел считается), поэтому false
        boolean result3Empty2 = emptyCharacter.isBlank();
        System.out.println(result3Empty2); //строка emptyCharacter пустая, поэтому true
        boolean result3Empty3 = emptyCharacter2.isBlank();
        System.out.println(result3Empty3); //строка emptyCharacter2 пустая(пробел не считается), поэтому true

        //вывод части строки "Зимний солдат - Баки"
        System.out.println(character.substring(7,14));

        //поиск индекса подстроки "Баки" в строке "Зимний солдат - Баки"
        int index = character.indexOf("Баки");
        System.out.println(index);

        //порядковый номер слова "солдат" в строке "Зимний солдат - Баки"
        int index1 = character.lastIndexOf("солдат");
        System.out.println(index1);

        //преобразование строки в нижний регистр
        String character2 = character.toLowerCase();
        System.out.println(character2);

        //преобразование строки в верхний регистр
        String character3 = character.toUpperCase();
        System.out.println(character3);

        //замена слова в строке
        System.out.println(character.replace("Баки", "это Баки Барнс"));

        //проверка, начинается ли строка с заданной подстроки
        System.out.println(character.startsWith("солдат"));  //ответ false
        System.out.println(character.startsWith("Зимний"));  //ответ true

        //проверка, заканчивается ли строка на заданную подстроку
        System.out.println(character.startsWith("солдат"));  //ответ false
        System.out.println(character.endsWith("Баки"));  //ответ true

        //повтор строки
        System.out.println(character.repeat(3));
        //вопрос: как тут добавить пробел?
        // а то слова слитные, ответ: Зимний солдат - БакиЗимний солдат - БакиЗимний солдат - Баки

        //проверка на последовательность слов
        System.out.println(character.contains("Баки")); //ответ true
        System.out.println(character.contains("Бкаи")); //ответ false

        //добавление слов в конец строки
        String newCharacter = character.concat(" отличный персонаж");
        System.out.println(newCharacter);

        //удаление пробелов в начале и в конце в строке
        String character4 = " Зимний солдат  ";
        System.out.println(character4.trim());

        //сравнение строк
        String character5 = "Зимний солдат";
        boolean result5 = character5.equals(character);
        System.out.println(result5); //ответ false

        String character6 = "ЗИМНИЙ солдат";
        boolean result6 = character6.equals(character5);
        System.out.println(result6); //ответ false

        String character7 = "Зимний солдат - Баки";
        boolean result7 = character7.equals(character);
        System.out.println(result7); //ответ true
    }
}
