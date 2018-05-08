package personal.shaneon.draftleagueapi.utils;

public class PositionParser {

    public PositionParser(int positionCode) {
        this.positionCode = positionCode;
        setPosition();
    }

    private int positionCode;
    private String[] positions = {"GK", "DEF", "MID", "ST"};
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition() {
        position = positions[positionCode - 1];
    }
}
