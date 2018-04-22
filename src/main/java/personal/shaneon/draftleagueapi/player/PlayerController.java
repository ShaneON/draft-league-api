package personal.shaneon.draftleagueapi.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method= RequestMethod.GET, value="/players")
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @RequestMapping(method= RequestMethod.GET, value="/updateplayers")
    public Player[] getUpdatedPlayerData() {
        return playerService.getUpdatedPlayerData();
    }

    @RequestMapping(method= RequestMethod.GET, value="/updatescores/{gameweek}")
    public PlayerStats[] getUpdatedScores(@PathVariable String gameweek) { return playerService.getUpdatedScores(gameweek); }

    @RequestMapping(method=RequestMethod.GET, value="/players/{id}")
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/players")
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/players/{id}")
    public void updatePlayer(@RequestBody Player player) {
        playerService.updatePlayer(player);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/players/{id}")
    public void deleteMember(@RequestBody Player player) {
        playerService.deletePlayer(player);
    }
}
