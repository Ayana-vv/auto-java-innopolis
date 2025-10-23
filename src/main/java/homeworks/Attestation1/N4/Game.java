package homeworks.Attestation1.N4;

public class Game {
    private int userScore;
    private int pcScore;

    public void moveGame(String userValue, String pcValue) {
        int userScore = 0;
        int pcScore = 0;

        //ход игры
        if (userValue.equalsIgnoreCase(pcValue)) {                                                                  //если ходы одинаковы, то ничья
            System.out.println("Результат раунда - Ничья!");
        } else {
            if ((userValue.equalsIgnoreCase("К") && pcValue.equalsIgnoreCase("Н")) ||       //ходы, когда
                    (userValue.equalsIgnoreCase("Н") && pcValue.equalsIgnoreCase("Б")) ||   //пользователь
                    (userValue.equalsIgnoreCase("Б") && pcValue.equalsIgnoreCase("К"))) {   //выигрывает
                System.out.println("Результат раунда - Вы выиграли!");
                this.userScore += points(userValue);                                                                //подсчет очков
            } else {
                this.pcScore += points(pcValue);
                System.out.println("Результат раунда - Компьютер выиграл!");                                        //ходы, когда пк выигрывает
            }
        }
    }

    //очки
    public int points(String choice) {
        return switch (choice.toUpperCase()) {
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
