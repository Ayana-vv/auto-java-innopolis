package homeworks.Number4_L5.AboutCar;

public class Car {
    private String model;
    private String color;
    private int number;
    private int currentSpeed = 0;       //скорость по-умолчанию равна 0
    private int year;

    public Car(String model, String color, int number, int year) {
        this.model = model;
        this.color = color;
        this.number = number;
        this.year = year;
    }

    public void speedUp(int nowCurrentSpeed) {
        if (nowCurrentSpeed > 0) {                                      //проверка скорости для увеличения
            currentSpeed = currentSpeed + nowCurrentSpeed;              //увеличение скорости
            System.out.println("Текущая скорость: " + currentSpeed);    //вывод на экран значение
        }
        else {
            currentSpeed = 0;
        }
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void breakSpeed(int nowCurrentSpeed) {
        if (nowCurrentSpeed <= 10) {                                                    //проверка скорости для уменьшения
            currentSpeed = 0;                                                           //снижение скорости до 0
            System.out.println("Текущая скорость снижена до: " + currentSpeed);         //вывод на экран значение
        }
        else {
            currentSpeed = nowCurrentSpeed - 10;                                        //снижение скорости на 10
            System.out.println("Текущая скорость снижена на 10: " + currentSpeed);      //вывод на экран значение
        }
    }
}
