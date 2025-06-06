package homeworks.Number2_L3.p2;

public class Flat {
    Room room;
    int countRooms;
    int floor;
    boolean isRepair;  //проверка на ремонт: true - есть ремонт, false - без ремонта

    public Flat(int myCountRooms, int myFloor, boolean myIsRepair, Room room) {
        countRooms = myCountRooms;
        floor = myFloor;
        isRepair = myIsRepair;
        room = room;
    }
}
