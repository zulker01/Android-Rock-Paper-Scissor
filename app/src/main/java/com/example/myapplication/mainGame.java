package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.System.exit;

public class mainGame extends AppCompatActivity {
    EditText input;
    TextView score ;
    Integer points =0 ;
    Integer pcChoice;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game_page);

        Intent intent = this.getIntent();
        int pak = intent.getIntExtra("pak",10);

        Toast quitToast = Toast.makeText(mainGame.this,"make me feel "+pak, Toast.LENGTH_LONG);
        quitToast.show();

        Button rockButton = (Button) findViewById(R.id.rockButton);
        Button paperButton = (Button) findViewById(R.id.paperButton);
        Button scissorButton = (Button) findViewById(R.id.scissorButton);
        Button backButton = (Button) findViewById(R.id.backButton);

        score = (TextView) findViewById(R.id.scoreNumber);
        score.setText(points.toString());
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                     pcChoice = rand.nextInt(3);
                     if(pcChoice == 0)
                         points = points + 2;
                     else
                         points = points - 1;
                score.setText(points.toString());
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pcChoice = rand.nextInt(3);
                if(pcChoice == 1)
                    points = points + 2;
                else
                    points = points - 1;
                score.setText(points.toString());
            }
        });

        scissorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pcChoice = rand.nextInt(3);
                if(pcChoice == 2)
                    points = points + 2;
                else
                    points = points - 1;
                score.setText(points.toString());
            }
        });

        backButton.setOnClickListener(new View.OnClickListener()
                                       {
                                           @Override
                                           public void onClick(View view)
                                           {

                                               Intent intent1 = new Intent(mainGame.this, MainActivity.class);
                                               startActivity(intent1);
                                           }
                                       }
        );



    }
}