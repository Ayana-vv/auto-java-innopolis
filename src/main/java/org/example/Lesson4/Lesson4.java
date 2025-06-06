package org.example.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
//        Track track = new Track(3, "Jake", "XO");
//        System.out.println(track.author);

        String human1 = "89995551122";
        String human2 = "89554447788";
        String human3 = "89990002233";
        String human4 = "89995551122";

        String[] humans = new String[4];
        humans[0] = "89995551122";
        humans[1] = "89554447788";
        humans[2] = "89990002233";
        humans[3] = "89995551122";

        String[] humans2 = new String[]{"89995551122","89554447788","89990002233","89995551122"};
        String[] humans3 = {"89995551122","89554447788","89990002233","89995551122"};

        System.out.println(humans2[2]);
        System.out.println(humans3[3]);

        long[] someLongNumbers = {25114L, 200000054444L, 11144477700L};
        float[] someFloatNumbers = new float[10];
        someFloatNumbers[5] = 52.24f;
        System.out.println(someFloatNumbers[5]);

        boolean[] isSomeBoolean = {true, false, false, true};

        Track[] playList = new Track[10];
        playList[0] = new Track(3, "Jake", "XO");
        playList[1] = new Track(4, "Agust D", "D-Day");
        System.out.println(playList[0].author);
        System.out.println(playList[1].author);

        Track[] playList2 = {
                new Track(3, "Jake", "XO"),
                new Track(4, "Agust D", "D-Day")
        };
        System.out.println(playList2[1].title);


//        int[] numbers = new int[100];
//        System.out.println(numbers[99]);

    }
}
