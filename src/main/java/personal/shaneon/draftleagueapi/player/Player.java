package personal.shaneon.draftleagueapi.player;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

    public Player() {}

    public Player(String id, String name, int points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }

    @Id
    private String id;
    private String name;
    private int points;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
