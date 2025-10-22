package homeworks.Number5_L6.p5;

import java.util.Objects;

public class Player {
    private int id;
    private String nickName;
    private boolean isOnline;

    public Player(int id, String nickName, boolean isOnline) {
        this.id = id;
        this.nickName = nickName;
        this.isOnline = isOnline;
    }
    //переопределение методов equals(), hashCode() и toString() через конструктор
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickName, player.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickName, isOnline);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
    public String getNickName() {
        return nickName;
    }
    public int getId() {
        return id;
    }
}
