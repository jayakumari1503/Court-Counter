package com.chhavi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfTeamA=0, scoreOfTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeIncrementInTeamA(View view) {
        scoreOfTeamA += 3;
        displayScoreForTeamA(scoreOfTeamA);
    }

    public void twoIncrementInTeamA(View view) {
        scoreOfTeamA += 2;
        displayScoreForTeamA(scoreOfTeamA);
    }

    public void freeThrowInTeamA(View view) {
        scoreOfTeamA += 1;
        displayScoreForTeamA(scoreOfTeamA);
    }

    public void threeIncrementInTeamB(View view) {
        scoreOfTeamB += 3;
        displayScoreForTeamB(scoreOfTeamB);
    }

    public void twoIncrementInTeamB(View view) {
        scoreOfTeamB += 2;
        displayScoreForTeamB(scoreOfTeamB);
    }

    public void freeThrowInTeamB(View view) {
        scoreOfTeamB += 1;
        displayScoreForTeamB(scoreOfTeamB);
    }

    private void displayScoreForTeamA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.team_A_Score);
        scoreA.setText(String.valueOf(scoreOfTeamA));
    }

    private void displayScoreForTeamB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.team_B_score);
        scoreB.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayScoreForTeamA(scoreOfTeamA);
        displayScoreForTeamB(scoreOfTeamB);
    }
}