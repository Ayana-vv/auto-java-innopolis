package org.example.Lesson4;

public class AboutFor {
    public static void main(String[] args) {
        Track[] playList2 = {
                new Track(3, "Jake", "XO"),
                new Track(4, "Agust D", "D-Day"),
                new Track(2, "Jin", "Heart on the window"),
                new Track(5, "IM", "Don't Speak"),
                new Track(3, "Scoups", "Fire"),
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
        for (int i = 0; i < playList2.length; i = i + 1) {
            System.out.println("Автор: " + playList2[i].author + " " + "Заголовок: " + playList2[i].title + " " +
                "Продолжительность: " + playList2[i].duration + " " + "Продажа " + playList2[i].onSale);
        }
        for (Track track : playList2) {
            System.out.println("Автор: " + track.author + " " + "Заголовок: " + track.title + " " +
                    "Продолжительность: " + track.duration + " " + "Продажа " + track.onSale);
        }

        //двухмерный массив
        int[][] strangerThings = {
                {10,9,9},
                {10,10,10,10,10},
                {8,9,5},
                {10,9,10,10,10,10,10}
        };
        for (int i = 0; i < strangerThings.length; i++) {
            System.out.println(strangerThings[i][0]);
        }
    }
}
