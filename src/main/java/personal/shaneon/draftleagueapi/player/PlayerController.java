package personal.shaneon.draftleagueapi.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method= RequestMethod.GET, value="/players")
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method= RequestMethod.GET, value="/update-players")
    public Player[] getUpdatedPlayerData() {
        return playerService.getUpdatedPlayerData();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method= RequestMethod.GET, value="/update-scores/{gameweek}")
    public Map<String, PlayerStats> getUpdatedScores(@PathVariable String gameweek) { return playerService.getUpdatedScores(gameweek); }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/players/{id}")
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.POST, value="/players")
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.PUT, value="/players/{id}")
    public void updatePlayer(@RequestBody Player player) {
        playerService.updatePlayer(player);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.DELETE, value="/players/{id}")
    public void deleteMember(@RequestBody Player player) {
        playerService.deletePlayer(player);
    }
}
