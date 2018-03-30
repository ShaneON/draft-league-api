package personal.shaneon.draftleagueapi.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    }

    public void updatePlayer(Player player, String id) {
    }

    public void deletePlayer(Player player) {
    }
}
