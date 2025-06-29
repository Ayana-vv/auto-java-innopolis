package homeworks.Number4_L5;

public class MaskCard {
    public static void main(String[] args) {
        Card cardVisa = new Card("4276 5555 1111 3456", "12/29", 754, 1196);
//        System.out.println("Номер карты: " + cardVisa.number.replace("4276 5555 1111", "**** **** ****"));
        cardVisa.setNumber();
        String card2 = cardVisa.getNumber();
        System.out.println(card2);
    }
}
