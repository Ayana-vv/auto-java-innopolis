package homeworks.Number2_L3.p3;

//Описание товаров интернет-магазина

public class Task3 {
    public static void main(String[] args) {
        Item laptop1 = new Item("HP_88", 115521, 16, "серый", true);
        Item laptop2 = new Item("asos_51", 115522,  1, "белый", true);
        Item camera = new Item("Canon_03", 012030,  50, "розовый", true);
        Item phone1 = new Item("Samsung", 755501,  7, "синий", true);
        Item phone2 = new Item("Xiaomi", 445511,  0, "чёрный", false);
        //задаем отдельно цены
        laptop1.price = "33000";
        laptop2.price = "85500";
        camera.price = "6500";
        phone1.price = "27300";
        phone2.price = "15200";
        System.out.println(laptop1.art + " " + laptop1.name + " " + laptop1.price + " " + laptop1.count + " " + laptop1.color);
        System.out.println(laptop2.art + " " + laptop2.name + " " + laptop2.price + " " + laptop2.count + " " + laptop2.color);
        System.out.println(camera.art + " " + camera.name + " " + camera.price + " " + camera.count + " " + camera.color);
        System.out.println(phone1.art + " " + phone1.name + " " + phone1.price + " " + phone1.count + " " + phone1.color);
        System.out.println(phone2.art + " " + phone2.name + " " + phone2.price + " " + phone2.count + " " + phone2.color);
    }

}
