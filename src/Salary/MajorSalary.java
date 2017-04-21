package Salary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-20.
 */
public class MajorSalary {
    private LocalDate yearID;
    private String team;
    private String league;
    private String playerID;
    private int salary;

    @Override
    public String toString() {
        return  "yearID=" + yearID +
                ", team='" + team + '\'' +
                ", league='" + league + '\'' +
                ", playerID='" + playerID + '\'' +
                ", salary=" + salary;
    }

    public LocalDate getYearID() {
        return yearID;
    }

    public void setYearID(LocalDate yearID) {

        this.yearID = yearID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MajorSalary(LocalDate yearID, String team, String league, String playerID, int salary) {

        this.yearID = yearID;
        this.team = team;
        this.league = league;
        this.playerID = playerID;
        this.salary = salary;
    }
}
