package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        playerRepository.findAll()
                .forEach(players::add);
        return players;
    }

    public Player getPlayer(String id) {
        return playerRepository.findById(id).get();
    }

    public void addPlayer(Player player) {
        playerRepository.save(player);
    }

    public void updatePlayer(Player player) {
        playerRepository.save(player);
    }

    public void deletePlayer(Player player) {
        playerRepository.delete(player);
    }

    public Player[] getUpdatedPlayerData() {
        RestTemplate rt = new RestTemplate();
        String fplApi = "https://fantasy.premierleague.com/drf/bootstrap-static";
        ResponseEntity<String> response = rt.getForEntity(fplApi, String.class);
        Player[] playerList = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());

            playerList = mapper.convertValue(root.get("elements"), Player[].class);
            for(int i = 0; i < playerList.length; i++) {
                playerRepository.save(playerList[i]);
            }

        }
        catch(IOException e){}

        return playerList;
    }
}
