package personal.shaneon.draftleagueapi.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.katharsis.resource.annotations.JsonApiResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonApiResource(type = "players")
//@JsonNaming(PropertyNamingStrategy.LOWER_CAMEL_CASE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

    public Player() {}

    public Player(String id, String status, String firstName, String secondName, int squadNumber, String news,
                  int chanceOfPlayingThisRound, int chanceOfPlayingNextRound, int totalPoints, int goalsScored,
                  int assists, int cleanSheets, int goalsConceded, int ownGoals, int penaltiesSaved, int penaltiesMissed,
                  int yellowCards, int redCards, int saves, int bonus, int bps, String photo, int teamCode,
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
        this.teamCode = teamCode;
        this.position = position;
        this.team = team;
        this.memberId = memberId;
        this.gameweekPoints = gameweekPoints;
        this.elementType = elementType;
    }

    @Id
    private String id;
    private String status;
    @JsonProperty(value = "first_name")
    private String firstName;
    @JsonProperty(value = "second_name")
    private String secondName;
    @JsonProperty(value = "squad_number")
    private int squadNumber;
    @JsonProperty(value = "chance_of_playing_this_round")
    private int chanceOfPlayingThisRound;
    @JsonProperty(value = "chance_of_playing_next_round")
    private int chanceOfPlayingNextRound;
    @JsonProperty(value = "total_points")
    private int totalPoints;
    @JsonProperty(value = "goals_scored")
    private int goalsScored;
    private String news;
    private int assists;
    @JsonProperty(value = "clean_sheets")
    private int cleanSheets;
    @JsonProperty(value = "goals_conceded")
    private int goalsConceded;
    @JsonProperty(value = "own_goals")
    private int ownGoals;
    @JsonProperty(value = "penalties_saved")
    private int penaltiesSaved;
    @JsonProperty(value = "penalties_missed")
    private int penaltiesMissed;
    @JsonProperty(value = "yellow_cards")
    private int yellowCards;
    @JsonProperty(value = "red_cards")
    private int redCards;
    private int saves;
    private int bonus;
    private int bps;
    private String photo;
    @JsonProperty(value = "team_code")
    private int teamCode;
    @JsonProperty(value = "element_type")
    private int elementType;
    private String position;
    private int team;
    @Column(name = "member_id")
    private String memberId;
    @Column(name = "gameweek_points")
    private int gameweekPoints;
    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getElementType() {
        return elementType;
    }

    public void setElementType(int elementType) {
        this.elementType = elementType;
    }

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

    public int getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
