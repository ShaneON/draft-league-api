package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStats {

    public PlayerStats() {}

    @JsonProperty(value = "stats")
    private Stats stats;

    public String toString() {
        return Integer.toString(getStats().getGameweekPoints());
    }

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

    public Stats(int gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }

    @JsonProperty(value = "total_points")
    @Column(name = "gameweek_points")
    private int gameweekPoints;

    public int getGameweekPoints() {
        return gameweekPoints;
    }

    public void setGameweekPoints(int gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }
}
