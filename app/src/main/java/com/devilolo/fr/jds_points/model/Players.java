package com.devilolo.fr.jds_points.model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Players implements Serializable {
    private String gameName;
    private ArrayList<Player> players;

    public Players(String gameName) {
        this.gameName = gameName;
        players = new ArrayList<>();
    }


    public String getGameName() {
        return gameName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        if(nbPlayers() <= 8 ){
            players.add(player);
        }
    }

    public int nbPlayers(){
        return players.size();
    }
}
