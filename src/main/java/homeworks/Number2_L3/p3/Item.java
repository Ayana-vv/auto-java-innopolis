package homeworks.Number2_L3.p3;

public class Item {
    String name;
    int art;
    String price;
    int count;
    String color;
    boolean available; //проверка на наличие товара, где true-в наличии, false-отсутствует

    public Item(String myName, int myArt, int myCount, String myColor, boolean myAvailable) {
        name = myName;
        art = myArt;
        //price = myPrice; удаляем отсюда, т.к. параметр необязательный
        count = myCount;
        color = myColor;
        available = myAvailable;
    }
}
