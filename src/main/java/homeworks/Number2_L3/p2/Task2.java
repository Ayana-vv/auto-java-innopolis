package homeworks.Number2_L3.p2;

public class Task2 {
    public static void main(String[] args) {
        Flat flat1 = new Flat(2, 11, true, new Room("кухня", "серая", "3x4"));
        Flat flat2 = new Flat(4, 2, false, new Room("спальня", "синяя", "6x7"));
        Flat flat3 = new Flat(1, 1, false, new Room("кухня-зал", "зеленая", "5x5"));
        Flat flat4 = new Flat(2, 10, true, new Room("гостиная и спальня", "фиолетовая", "8x7"));
//        хотела вывести полученное, но тк в задании такого нет, то закомментила
//        System.out.println(flat1.countRooms + " " + flat1.floor + " " + flat1.isRepair + " " + flat1.room);
//        System.out.println(flat2.countRooms + " " + flat2.floor + " " + flat2.isRepair + " " + flat2.room);
//        System.out.println(flat3.countRooms + " " + flat3.floor + " " + flat3.isRepair + " " + flat3.room);
//        System.out.println(flat4.countRooms + " " + flat4.floor + " " + flat4.isRepair + " " + flat4.room);
    }
}