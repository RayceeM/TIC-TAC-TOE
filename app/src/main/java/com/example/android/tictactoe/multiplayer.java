package com.example.android.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class multiplayer extends AppCompatActivity implements View.OnClickListener {
    Button mthree,mfive;
    EditText p1,p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);
        mthree=(Button)findViewById(R.id.mthree);
        mfive=(Button)findViewById(R.id.mfive);
        mthree.setOnClickListener(this);
        mfive.setOnClickListener(this);
p1=(EditText)findViewById(R.id.p1);
p2=(EditText)findViewById(R.id.p2);

    }

    @Override
    public void onClick(View v) {
        if(v==mthree)
        {

            String plone=p1.getText().toString();
            String pltwo=p2.getText().toString();
            if(plone.equals("")|| pltwo.equals(""))
            {
                Toast.makeText(this, "Enter player names!", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(multiplayer.this, multiThree.class);
                i.putExtra("player_1", plone);
                i.putExtra("player_2", pltwo);
                startActivity(i);
            }
        }

        else if(v==mfive)
        {
            String plone=p1.getText().toString();
            String pltwo=p2.getText().toString();
            if(plone.equals("")|| pltwo.equals(""))
            {
                Toast.makeText(this, "Enter player names!", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(multiplayer.this, Mfive.class);
                i.putExtra("player_1", plone);
                i.putExtra("player_2", pltwo);
                startActivity(i);
            }
        }
    }
}
