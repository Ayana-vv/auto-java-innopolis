package homeworks.Number4_L5;

public class Card {
    String number;
    String expiry;
    int cvv;
    int pinCode;

    public Card(String number, String expiry, int cvv, int pinCode) {
        this.number = number;
        this.expiry = expiry;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }
    public void setNumber() {
        number = number.replace("4276 5555 1111 3456", "**** **** **** **** 3456");
        System.out.println(number);
    }
    public String getNumber() {
        return number;
    }

}
