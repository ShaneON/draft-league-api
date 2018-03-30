package personal.shaneon.draftleagueapi.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    public Member() {}

    public Member(String id, String name, String teamName) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
    }

    @Id
    private String id;
    private String name;
    private String teamName;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }


    public void setId(String id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String name) {
        this.teamName = teamName;
    }
}
