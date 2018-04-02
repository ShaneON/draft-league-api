package personal.shaneon.draftleagueapi.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

    public Player() {}

    public Player(String id, String name, int points, String memberId) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.memberId = memberId;
    }

    @Id
    private String id;
    private String name;
    private int points;
    @Column(name = "member_id")
    private String memberId;

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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
