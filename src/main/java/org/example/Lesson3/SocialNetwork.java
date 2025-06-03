package org.example.Lesson3;

public class SocialNetwork {
    public static void main(String[] args) {
        //String name = "Михаил";
        User mihail = new User("Михаил", "Мишкин", 22, "+7999058", "mihail@ya.ru");
        System.out.println(mihail.name + " " + mihail.surname + " " + mihail.age + " " + mihail.email + " " + mihail.phone);
        mihail.phone = "000789";
        System.out.println(mihail.name + " " + mihail.surname + " " + mihail.age + " " + mihail.email + " " + mihail.phone);
        //System.out.println(mihail.name);
//        mihail.name = "Михаил";
//        System.out.println(mihail.name);
//        //System.out.println(mihail.age);
//        mihail.age = 22;
//        //System.out.println(mihail.age);
//        //mihail.email = "mihail@ya.ru";
//        mihail.isOnline = true;
//        System.out.println(mihail.name + " " + mihail.surname + " " + mihail.email + " " + mihail.age);

//        User alex = new User();
//        alex.name = "Александр";
//        alex.age = 35;
//        alex.email = "alex@ya.ru";
//        alex.isOnline = true;
//        System.out.println(alex.name + " " + alex.surname + " " + alex.email + " " + alex.age);

        Car car = new Car();
        car.brand = "Mazda";
        car.model = "6";
        car.year = 2022;
        car.price = 3_500_000;
        System.out.println(car.brand + " " + car.model + " " + car.year + " " + car.price);

    }
}
