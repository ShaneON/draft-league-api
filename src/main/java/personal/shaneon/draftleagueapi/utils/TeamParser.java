package personal.shaneon.draftleagueapi.utils;

public class TeamParser {

    public TeamParser(int teamCode) {
        this.teamCode = teamCode;
        setTeam();
    }

    private int teamCode;
    private String[] teams = {"ARS", "BOU", "BHA", "BUR", "CHE", "CRY", "EVE", "HUD", "LEI",
                                    "LIV", "MCI", "MUN", "NEW", "SOU", "STK", "SWA", "TOT", "WAT", "WBA", "WHU"};
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam() {
        team = teams[teamCode - 1];
    }
}
