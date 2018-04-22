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
        String playerEndpoint = "https://fantasy.premierleague.com/drf/bootstrap-static";
        ResponseEntity<String> response = rt.getForEntity(playerEndpoint, String.class);
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

    public PlayerStats[] getUpdatedScores(String gameweek) {
        RestTemplate rt = new RestTemplate();
        String gameweekEndpoint = "https://fantasy.premierleague.com/drf/event/" + gameweek + "/live";
        ResponseEntity<String> response = rt.getForEntity(gameweekEndpoint, String.class);
        PlayerStats[] statsList = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());

            statsList = mapper.convertValue(root.get("elements"), PlayerStats[].class);
            for(int i = 0; i < statsList.length; i++) {
                System.out.println(statsList[i]);
            }

        }
        catch(IOException e){}

        return statsList;
    }
}
