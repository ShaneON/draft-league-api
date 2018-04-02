package personal.shaneon.draftleagueapi.member;

import personal.shaneon.draftleagueapi.player.Player;

import javax.persistence.*;
import java.util.List;

@Entity
public class Member {

    public Member() {}

    public Member(String id, String memberName, String teamName) {
        this.id = id;
        this.memberName = memberName;
        this.teamName = teamName;
    }

    @Id
    @Column(name = "member_id")
    private String id;
    private String memberName;
    private String teamName;

    @OneToMany
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private List<Player> squad;

    public String getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getSquad() {
        return squad;
    }
}
