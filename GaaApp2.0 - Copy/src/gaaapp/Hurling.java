/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaaapp;

/**
 *
 * @author x16354406
 */
public class Hurling extends Gaa{
    public int gamesPlayed;
    public int wides;
    public int goals;
    public int points;
    
    public Hurling(){
        super();
        gamesPlayed = 0;
        wides = 0;
        goals = 0;
        points = 0;
    }
    public Hurling(String name, int age, String team, String position, int gamesPlayed, int wides, int goals, int points){
        super(name, age, team, position);
        this.gamesPlayed = gamesPlayed;
        this.wides = wides;
        this.goals = goals;
        this.points = points;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getWides() {
        return wides;
    }

    public int getGoals() {
        return goals;
    }

    public int getPoints() {
        return points;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public void setWides(int wides) {
        this.wides = wides;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
