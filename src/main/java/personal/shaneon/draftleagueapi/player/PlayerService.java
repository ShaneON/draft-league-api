package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import personal.shaneon.draftleagueapi.utils.PositionParser;
import personal.shaneon.draftleagueapi.utils.TeamParser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

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
        rt.getMessageConverters()
                .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String playerEndpoint = "https://fantasy.premierleague.com/drf/bootstrap-static";
        ResponseEntity<String> response = rt.getForEntity(playerEndpoint, String.class);
        Player[] playerList = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
//            mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
            JsonNode root = mapper.readTree(response.getBody());

            playerList = mapper.convertValue(root.get("elements"), Player[].class);
            for(int i = 0; i < playerList.length; i++) {
                TeamParser teamParser = new TeamParser(playerList[i].getTeam());
                PositionParser positionParser = new PositionParser(playerList[i].getElementType());
                playerList[i].setTeamName(teamParser.getTeam());
                playerList[i].setPosition(positionParser.getPosition());
                playerRepository.save(playerList[i]);
            }

        }
        catch(IOException e){}

        return playerList;
    }

    public Map<String, PlayerStats> getUpdatedScores(String gameweek) {
        RestTemplate rt = new RestTemplate();
        rt.getMessageConverters()
                .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        String gameweekEndpoint = "https://fantasy.premierleague.com/drf/event/" + gameweek + "/live";
        ResponseEntity<String> response = rt.getForEntity(gameweekEndpoint, String.class);
        Map<String, PlayerStats> statsMap = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
            JsonNode root = mapper.readTree(response.getBody());
            JsonNode elements = root.get("elements");
            statsMap = mapper.readValue(elements.toString(), new TypeReference<HashMap<String, PlayerStats>>() {});

        }
        catch(IOException e){}

        Iterator it = statsMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, PlayerStats> playerStats = (Map.Entry<String, PlayerStats>)it.next();
            Player playerToUpdate = playerRepository.findById(playerStats.getKey()).get();
            playerToUpdate.setGameweekPoints(playerStats.getValue().getStats().getGameweekPoints());
            playerRepository.save(playerToUpdate);
            it.remove(); // avoids a ConcurrentModificationException
        }

        return statsMap;
    }
}
