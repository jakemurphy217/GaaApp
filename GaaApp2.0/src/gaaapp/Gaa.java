/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaaapp;

import java.io.Serializable;

/**
 *
 * @author x16354406
 */
public class Gaa implements Serializable{ //for the write to file method
    //variables
    protected String name;
    protected int age;
    protected String team;
    protected String position;
    
    //declaring the variables
    public Gaa(){
        name = " ";
        age = 0;
        team = " ";
        position = " ";
        
    }
    //supper class methos
    public Gaa(String name, int age, String team, String position){
        super();
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
