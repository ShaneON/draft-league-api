package personal.shaneon.draftleagueapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import personal.shaneon.draftleagueapi.player.UpdatePlayers;

@SpringBootApplication
public class DraftLeagueApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DraftLeagueApiApplication.class, args);

        UpdatePlayers up = new UpdatePlayers();
        String player = up.getUpdatedPlayerData();
        System.out.print(player);
	}
}
