package personal.shaneon.draftleagueapi.member;

import personal.shaneon.draftleagueapi.player.Player;

import javax.persistence.*;
import java.util.List;

@Entity
//@JsonApiResource(type = "members")
public class Member {

    public Member() {}

    public Member(String memberName, String teamName, String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.memberName = memberName;
        this.teamName = teamName;
    }

    @Id
    @Column(name = "member_id")
    @GeneratedValue
    private Integer id;
    private String memberName;
    private String userName;
    private String password;
    private String teamName;

    @OneToMany
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    private List<Player> squad;

    public Integer getId() {
        return id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setId(Integer id) {

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
