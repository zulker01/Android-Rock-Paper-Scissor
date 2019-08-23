package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static java.lang.System.exit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) findViewById(R.id.startButton);
        Button helpButton = (Button) findViewById(R.id.helpButton);
        Button quitButton = (Button) findViewById(R.id.quitButton);

        helpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast helpToast = Toast.makeText(MainActivity.this,R.string.helpToast, Toast.LENGTH_LONG);
                helpToast.show();
            }
        }
        );

        quitButton.setOnClickListener(new View.OnClickListener()
                                      {
                                          @Override
                                          public void onClick(View view)
                                          {
                                              Toast quitToast = Toast.makeText(MainActivity.this,R.string.quitToast, Toast.LENGTH_LONG);
                                              quitToast.show();
                                              exit(0);
                                          }
                                      }
        );

        startButton.setOnClickListener(new View.OnClickListener()
                                      {
                                          @Override
                                          public void onClick(View view)
                                          {
                                              Toast quitToast = Toast.makeText(MainActivity.this,R.string.quitToast, Toast.LENGTH_LONG);
                                              quitToast.show();
                                              Intent intent = new Intent(MainActivity.this, mainGame.class);
                                                intent.putExtra("pak",100);

                                              startActivity(intent);
                                          }
                                      }
        );
    }
}
