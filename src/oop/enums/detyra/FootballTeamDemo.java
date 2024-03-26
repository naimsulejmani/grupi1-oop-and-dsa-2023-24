package oop.enums.detyra;

import java.time.LocalDate;

public class FootballTeamDemo {
    public static void main(String[] args) {
        FootballTeam team1 = new FootballTeam(
                "LIV", "Liverpool Fc", "England", "Liverpool",
                "Anfield", LocalDate.of(1900, 7, 1));
        team1.setTrophies(66);
        FootballTeam team2 = new FootballTeam(
                "MCH", "Manchester United", "England", "Manchester",
                "Old Trafford", LocalDate.of(1899, 2, 1));
        team2.setTrophies(65);

        System.out.println(team1.compareTo(team2));
    }
}
