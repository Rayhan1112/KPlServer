package com.kplserver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
EditText matchnm,player1,player2,totalscore,bowler;
String matchname;
String striker,nstriker,total,bowlern;
    FirebaseDatabase database;
    DatabaseReference myref,myref1,myref2,myref3,myref4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        matchnm=findViewById(R.id.matchname);
        player1=findViewById(R.id.player1);
        player2=findViewById(R.id.player2);
        totalscore=findViewById(R.id.total);
        bowler=findViewById(R.id.bowler);

        database= FirebaseDatabase.getInstance();
        myref=database.getReference("Played");
        myref1=database.getReference("Player2");
        myref2=database.getReference("Matchname");
        myref3=database.getReference("Bowler");
        myref4=database.getReference("Total");







    }

    public void setvalue(View view) {

        matchname=matchnm.getText().toString();
        striker=player1.getText().toString();
        nstriker=player2.getText().toString();
        bowlern=bowler.getText().toString();
        total=totalscore.getText().toString();

       myref.setValue(striker);
       myref1.setValue(nstriker);
       myref2.setValue(matchname);
       myref3.setValue(bowlern);
       myref4.setValue(total);

    }
}