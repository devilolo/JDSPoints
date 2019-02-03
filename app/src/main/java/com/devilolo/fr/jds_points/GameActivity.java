package com.devilolo.fr.jds_points;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.devilolo.fr.jds_points.model.Player;
import com.devilolo.fr.jds_points.model.Players;


public class GameActivity extends AppCompatActivity {

    private TextView myText[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Players players = (Players) getIntent().getSerializableExtra("Players");

        myText = new TextView[8];
        myText[0] = findViewById(R.id.activity_game_j1);
        myText[1] = findViewById(R.id.activity_game_j2);
        myText[2] = findViewById(R.id.activity_game_j3);
        myText[3] = findViewById(R.id.activity_game_j4);
        myText[4] = findViewById(R.id.activity_game_j5);
        myText[5] = findViewById(R.id.activity_game_j6);
        myText[6] = findViewById(R.id.activity_game_j7);
        myText[7] = findViewById(R.id.activity_game_j8);

        for (int i = 0 ; i < players.nbPlayers() ; i++){
            Player player = players.getPlayers().get(i);
            myText[i].setText(player.getNom());
        }




    }
}