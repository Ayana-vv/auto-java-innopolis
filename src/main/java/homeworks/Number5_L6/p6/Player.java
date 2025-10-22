package homeworks.Number5_L6.p6;

import java.util.Objects;

public class Player {
    private int id;
    private String nickName;
    private boolean isOnline;
    private int point;

    public Player(int id, String nickName, int point) {
        this.id = id;
        this.nickName = nickName;
        this.isOnline = isOnline;
        this.point = point;
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
                ", point=" + point +
                '}';
    }
    public String getNickName() {
        return nickName;
    }

    public int getId() {
        return id;
    }

    public int getPoint() {
        return point;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
