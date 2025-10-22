package homeworks.Number7_L9;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class TestClass {
    public static void main(String[] args) throws IOException {

//        Player player1 = new Player(1, "Micah", 15, true);

        PlayerService service = new PlayerServiceJSON();

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValue(new File("player.json"), player1);

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);
        int playerId2 = service.createPlayer("WinMaster_888");
        service.addPoints(playerId2, 200);

        Player deletePlayer = service.deletePlayer(1);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
