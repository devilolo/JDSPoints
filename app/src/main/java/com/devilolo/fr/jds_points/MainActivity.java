package com.devilolo.fr.jds_points;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.devilolo.fr.jds_points.model.Players;
import com.devilolo.fr.jds_points.model.Player;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton addPlayer;
    private AppCompatButton myButton;
    private EditText myEditText;
    private TextView[] myText;
    private Players players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        players = new Players("mon jeu");

        myText = new TextView[8];
        myText[0] = findViewById(R.id.myName1);
        myText[1] = findViewById(R.id.myName2);
        myText[2] = findViewById(R.id.myName3);
        myText[3] = findViewById(R.id.myName4);
        myText[4] = findViewById(R.id.myName5);
        myText[5] = findViewById(R.id.myName6);
        myText[6] = findViewById(R.id.myName7);
        myText[7] = findViewById(R.id.myName8);


        myButton = findViewById(R.id.myButton);
        addPlayer = findViewById(R.id.myButton2);
        myEditText = findViewById(R.id.myEditText);



        myButton.setEnabled(false);
        addPlayer.setEnabled(false);

        myEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                addPlayer.setEnabled(charSequence.length()!=0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        addPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (players.nbPlayers() < 8 ) {
                    Player player = new Player(myEditText.getText().toString());
                    myText[players.nbPlayers()].setText("joueur"+ (players.nbPlayers()+1) +":"+myEditText.getText().toString());
                    myText[players.nbPlayers()].setVisibility(View.VISIBLE);
                    players.setPlayers(player);
                    myEditText.setText("");
                    myButton.setEnabled(true);
                    addPlayer.setEnabled(false);
                }
            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameAct = new Intent(MainActivity.this, GameActivity.class);
                gameAct.putExtra("Players", players);
                startActivity(gameAct);
            }
        });

    }
}
