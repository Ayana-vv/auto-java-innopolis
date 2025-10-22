package homeworks.Attestation1.N2;

import java.util.Random;

public class HumidityAir {
    //генератор рандомного числа для вычисления влажности воздуха
    public static int humidityAir() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
