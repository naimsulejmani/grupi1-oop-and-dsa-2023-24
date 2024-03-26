package oop.enums.detyra;

import java.time.LocalDate;

public class FootballTeam {
    private String id;

    private String name;

    private String country;

    private String city;

    private String stadium;

    private int trophies;

    private LocalDate established;

    public FootballTeam(String id, String name, String country, String city, String stadium) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.stadium = stadium;
    }

    public FootballTeam(String id, String name, String country, String city, String stadium, LocalDate established) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.stadium = stadium;
        this.established = established;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public LocalDate getEstablished() {
        return established;
    }

    public void setEstablished(LocalDate established) {
        this.established = established;
    }

    public int compareTo(FootballTeam otherTeam) {
        return this.trophies - otherTeam.trophies;
    }


}













