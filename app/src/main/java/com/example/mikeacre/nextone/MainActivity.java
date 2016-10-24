package com.example.mikeacre.nextone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team1Score = 0;
    int team2Score = 0;
    int newGame = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateScore(){
        TextView scoreView = (TextView) findViewById(R.id.team1score);
        scoreView.setText(String.valueOf(team1Score));

        TextView scoreViewTwo = (TextView) findViewById(R.id.team2score);
        scoreViewTwo.setText(String.valueOf(team2Score));
        TextView whoswinning = (TextView) findViewById(R.id.winning);

        if(newGame==1){
            whoswinning.setText("Let The Games begin!");
            newGame=0;
        }
        else {
            if (team1Score > team2Score) {
                whoswinning.setText("Team 1 in the lead!");
            } else if (team1Score < team2Score) {
                whoswinning.setText("Team 2 in the lead!");
            } else {
                whoswinning.setText("We Have a Tie!");
            }
        }
    }

    public void reset(View view){
        newGame=1;
        team1Score=0;
        team2Score=0;
        updateScore();
    }

    public void callGame(View view){
        TextView whoswinning = (TextView) findViewById(R.id.winning);
        if (team1Score > team2Score) {
            whoswinning.setText("Team 1 Has Won!");
        } else if (team1Score < team2Score) {
            whoswinning.setText("Team 2 Has One!");
        } else {
            whoswinning.setText("Overtime!!");
        }
    }

    public void addOneTeamOne(View view){
        team1Score = team1Score+1;
        updateScore();
    }
    public void addTwoTeamOne(View view){
        team1Score = team1Score+2;
        updateScore();
    }
    public void addThreeTeamOne(View view){
        team1Score = team1Score+3;
        updateScore();
    }
    public void addSixTeamOne(View view){
        team1Score = team1Score+6;
        updateScore();
    }
    public void addOneTeamTwo(View view){
        team2Score = team2Score+1;
        updateScore();
    }
    public void addTwoTeamTwo(View view){
        team2Score = team2Score+2;
        updateScore();
    }
    public void addThreeTeamTwo(View view){
        team2Score = team2Score+3;
        updateScore();
    }
    public void addSixTeamTwo(View view){
        team2Score = team2Score+6;
        updateScore();
    }
}
