package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    public Player() {}

    public Player(String id, String status, String firstName, String secondName, int squadNumber, String news,
                  int chanceOfPlayingThisRound, int chanceOfPlayingNextRound, int totalPoints, int goalsScored,
                  int assists, int cleanSheets, int goalsConceded, int ownGoals, int penaltiesSaved, int penaltiesMissed,
                  int yellowCards, int redCards, int saves, int bonus, int bps, String photo, String webName, int teamCode,
                  int elementType, int team, String memberId, int gameweekPoints) {
        this.id = id;
        this.status = status;
        this.firstName = firstName;
        this.secondName = secondName;
        this.squadNumber = squadNumber;
        this.news = news;
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
        this.totalPoints = totalPoints;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.cleanSheets = cleanSheets;
        this.goalsConceded = goalsConceded;
        this.ownGoals = ownGoals;
        this.penaltiesSaved = penaltiesSaved;
        this.penaltiesMissed = penaltiesMissed;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.saves = saves;
        this.bonus = bonus;
        this.bps = bps;
        this.photo = photo;
        this.webName = webName;
        this.teamCode = teamCode;
        this.elementType = elementType;
        this.team = team;
        this.memberId = memberId;
        this.gameweekPoints = gameweekPoints;
    }

    @Id
    private String id;
    private String status;
    private String firstName;
    private String secondName;
    private int squadNumber;
    private String news;
    private int chanceOfPlayingThisRound;
    private int chanceOfPlayingNextRound;
    private int totalPoints;
    private int goalsScored;
    private int assists;
    private int cleanSheets;
    private int goalsConceded;
    private int ownGoals;
    private int penaltiesSaved;
    private int penaltiesMissed;
    private int yellowCards;
    private int redCards;
    private int saves;
    private int bonus;
    private int bps;
    private String photo;
    private String webName;
    private int teamCode;
    private int elementType;
    private int team;
    @Column(name = "member_id")
    private String memberId;
    private int gameweekPoints;

    public int getGameweekPoints() {
        return gameweekPoints;
    }

    public void setGameweekPoints(int gameweekPoints) {
        this.gameweekPoints = gameweekPoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getChanceOfPlayingThisRound() {
        return chanceOfPlayingThisRound;
    }

    public void setChanceOfPlayingThisRound(int chanceOfPlayingThisRound) {
        this.chanceOfPlayingThisRound = chanceOfPlayingThisRound;
    }

    public int getChanceOfPlayingNextRound() {
        return chanceOfPlayingNextRound;
    }

    public void setChanceOfPlayingNextRound(int chanceOfPlayingNextRound) {
        this.chanceOfPlayingNextRound = chanceOfPlayingNextRound;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(int ownGoals) {
        this.ownGoals = ownGoals;
    }

    public int getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public void setPenaltiesSaved(int penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public int getPenaltiesMissed() {
        return penaltiesMissed;
    }

    public void setPenaltiesMissed(int penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public int getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }

    public int getElementType() {
        return elementType;
    }

    public void setElementType(int elementType) {
        this.elementType = elementType;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
