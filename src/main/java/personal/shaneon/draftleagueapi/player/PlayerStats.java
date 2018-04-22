package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStats {

    public PlayerStats() {}

    public PlayerStats(Stats stats) {
        this.stats = stats;
    }

    @JsonProperty(value = "stats")
    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Stats {

    public Stats() {}

    public Stats(String gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }

    @JsonProperty(value = "total_points")
    private String gameweekPoints;

    public String getGameweekPoints() {
        return gameweekPoints;
    }

    public void setGameweekPoints(String gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }
}
