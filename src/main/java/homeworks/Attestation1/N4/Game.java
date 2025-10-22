package homeworks.Attestation1.N4;

public class Game {
    private int userScore;
    private int pcScore;

    public void moveGame(String userValue, String pcValue) {
        int userScore = 0;
        int pcScore = 0;

//        if (userValue.toUpperCase().equals(pcValue.toUpperCase())) {
//                System.out.println("Результат раунда - Ничья!");
//        } else if ((userValue.toUpperCase().equals("К") && pcValue.toUpperCase().equals("Н")) ||
//                    (userValue.toUpperCase().equals("Н") && pcValue.toUpperCase().equals("Б")) ||
//                    (userValue.toUpperCase().equals("Б") && pcValue.toUpperCase().equals("К")) )
//                {
//                    this.userScore = points(userValue);
//                    System.out.println("Результат раунда - Вы выиграли!");
//        } else {
//            pcScore = points(pcValue);
//            System.out.println("Результат раунда - Компьютер выиграл!");
//        }
        if (userValue.equalsIgnoreCase(pcValue)) {
            System.out.println("Результат раунда - Ничья!");
        } else {
            if ((userValue.equalsIgnoreCase("К") && pcValue.equalsIgnoreCase("Н")) ||
                    (userValue.equalsIgnoreCase("Н") && pcValue.equalsIgnoreCase("Б")) ||
                    (userValue.equalsIgnoreCase("Б") && pcValue.equalsIgnoreCase("К"))) {
                System.out.println("Результат раунда - Вы выиграли!");
                this.userScore = points(userValue);
            } else {
                this.pcScore = points(pcValue);
                System.out.println("Результат раунда - Компьютер выиграл!");
            }
        }
    }

    public int points(String choice) {
        return switch (choice) {
            case "К" -> 1; // Камень - 1 балл
            case "Н" -> 2; // Ножницы - 2 балла
            case "Б" -> 5; // Бумага - 5 баллов
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }

    public int getUserScore() {
        return userScore;
    }

    public int getPcScore() {
        return pcScore;
    }
}
