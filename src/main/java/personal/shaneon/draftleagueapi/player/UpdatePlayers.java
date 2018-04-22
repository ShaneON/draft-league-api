package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class UpdatePlayers {

    @Autowired
    PlayerRepository playerRepository;

    public String getUpdatedPlayerData() {
        RestTemplate rt = new RestTemplate();
        String fplApi = "https://fantasy.premierleague.com/drf/bootstrap-static";
        ResponseEntity<String> response = rt.getForEntity(fplApi, String.class);
        JsonNode playerNode = null;
        Player[] playerList = null;
        try{
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());

            playerList = mapper.convertValue(root.get("elements"), Player[].class);

        }
        catch(IOException e){}


        return playerList[0].toString();
    }

}
