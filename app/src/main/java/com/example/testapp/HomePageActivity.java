package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    Button matchButton;
    Button pitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        matchButton = findViewById(R.id.matchButtonHP);
        pitButton = findViewById(R.id.pitButtonHP);

        matchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMatchPg();
            }
        });

        pitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPitPg();
            }
        });
    }


    private void goToMatchPg(){
        Intent goToMatchPgIn = new Intent(HomePageActivity.this, MatchPageActivity.class);
        startActivity(goToMatchPgIn);
    }


    private void goToPitPg(){
        Intent goToPitPgIn = new Intent(HomePageActivity.this, PitPageActivity.class);
        startActivity(goToPitPgIn);
    }
}


