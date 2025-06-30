package homeworks.Number4_L5;

public class Card {
    private String number;
    private String expiry;
    private int cvv;
    private int pinCode;

    public Card(String number, String expiry, int cvv, int pinCode) {
        this.number = number;
        this.expiry = expiry;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }
    //вывод номера карты в шифрованном формате
    public void setNumber() {
        String maskNumber = "3456";
        System.out.println("Карта: **** **** **** **** " + maskNumber);
    }
    public String getNumber() {
        return number;
    }
    //сравнение введенного пин-кода
    public void setPinCode(int pinCodeIn) {
        if (pinCode == pinCodeIn) {
            System.out.println("Пин-код корректен. Карта: " + getNumber());   //вывод полного номера карты, когда пин-коды совпадают
        }
        else {
            System.out.println("Пин-код некорректен");                        //вывод шифрованного номера карты, когда пин-коды не совпадают
        }
    }
}
