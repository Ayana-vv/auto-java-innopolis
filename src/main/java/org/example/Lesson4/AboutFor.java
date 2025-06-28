package org.example.Lesson4;

public class AboutFor {
    public static void main(String[] args) {
        Track[] playList2 = {
                new Track(3, "Jake", "XO"),
                new Track(4, "Agust D", "D-Day"),
                new Track(2, "Jin", "Heart on the window"),
                new Track(5, "IM", "Don't Speak")
        };
        System.out.println(playList2[1].title);

        playList2[0].onSale = true;
        playList2[1].onSale = true;
        playList2[2].onSale = true;
        playList2[3].onSale = true;

        System.out.println("Магазин: ");
//        int i = 0;
//        System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
//                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
//        i = i + 1;
//        System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
//                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
//        i = i + 1;
//        System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
//                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
//        i = i + 1;
//        System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
//                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
        for (int i = 0; i <4; i = i + 1) {
            System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
        }
    }
}
