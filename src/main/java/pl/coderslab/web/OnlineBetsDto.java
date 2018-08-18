package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OnlineBetsDto {

    @JsonProperty("firstTeam")
    private String firstTeamName;

    @JsonProperty("firstPoints")
    private String firstPoints;

    @JsonProperty("secondTeam")
    private String secondTeam;

    @JsonProperty("secondPoints")
    private String secondPoints;

    @JsonProperty("sport")
    private String sport;

    @Override
    public String toString() {
        return "Discipline: " + this.sport
                + "\n"
                + this.firstTeamName
                + this.firstPoints + " : "
                + this.secondPoints + " "
                + this.secondTeam;
    }

    public OnlineBetsDto() {
    }

    public OnlineBetsDto(String firstTeamName, String firstPoints, String secondTeam, String secondPoints, String sport) {
        this.firstTeamName = firstTeamName;
        this.firstPoints = firstPoints;
        this.secondTeam = secondTeam;
        this.secondPoints = secondPoints;
        this.sport = sport;
    }

    public String getFirstTeamName() {
        return firstTeamName;
    }

    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }

    public String getFirstPoints() {
        return firstPoints;
    }

    public void setFirstPoints(String firstPoints) {
        this.firstPoints = firstPoints;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String secondTeam) {
        this.secondTeam = secondTeam;
    }

    public String getSecondPoints() {
        return secondPoints;
    }

    public void setSecondPoints(String secondPoints) {
        this.secondPoints = secondPoints;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
