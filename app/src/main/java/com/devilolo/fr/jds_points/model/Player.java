package com.devilolo.fr.jds_points.model;

import java.io.Serializable;

public class Player implements Serializable {
    private String nom;
    private int points;

    public Player(String nom){
        this.nom = nom;
        points = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
