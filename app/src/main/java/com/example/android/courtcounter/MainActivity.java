package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void threePointsTeamA (View view){
        scoreTeamA = scoreTeamA + 3;
displayForTeamA(scoreTeamA);}
    public void twoPointsTeamA (View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA); }
    public void freeThrowTeamA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);}


    /** CODING FOR TEAM B*/
    public void twoPointsTeamB (View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB); }

    public void threePointsTeamB (View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);}
    public void freeThrowTeamB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);}
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

