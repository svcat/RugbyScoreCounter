package com.example.android.rugbyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  // Trackes the score for Team A
  int scoreTeamA = 0;
  // Trackes the score for Team B
  int scoreTeamB = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  /**
   * Displays the given score for Team A.
   */
  public void displayForTeamA(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_a_score);
    scoreView.setText(String.valueOf(score));
  }

  /**
   * Increase scoreTeamA  by 5
   */
  public void plussFiveForTeamA(View view) {
    scoreTeamA = scoreTeamA + 5;
    displayForTeamA(scoreTeamA);
  }

  /**
   * Increase scoreTeamA by 7
   */
  public void plussSevenForTeamA(View view) {
    scoreTeamA = scoreTeamA + 7;
    displayForTeamA(scoreTeamA);
  }

  /**
   * Increase scoreTeamA by 2
   */
  public void plussTwoForTeamA(View view) {
    scoreTeamA = scoreTeamA + 2;
    displayForTeamA(scoreTeamA);
  }

  /**
   * Increase scoreTeamA by 3
   */
  public void plussThreeForTeamA(View view) {
    scoreTeamA = scoreTeamA + 3;
    displayForTeamA(scoreTeamA);
  }

  /**
   * Displays the given score for Team B.
   */
  public void displayForTeamB(int score) {
    TextView scoreView = (TextView) findViewById(R.id.team_b_score);
    scoreView.setText(String.valueOf(score));
  }

  /**
   * Increase scoreTeamB by 7
   */
  public void plussSevenForTeamB(View view) {
    scoreTeamB = scoreTeamB + 7;
    displayForTeamB(scoreTeamB);
  }

  /**
   * Increase scoreTeamB by 5
   */
  public void plussFiveForTeamB(View view) {
    scoreTeamB = scoreTeamB + 5;
    displayForTeamB(scoreTeamB);
  }

  /**
   * Increase scoreTeamB  by 3
   */
  public void plussThreeForTeamB(View view) {
    scoreTeamB = scoreTeamB + 3;
    displayForTeamB(scoreTeamB);
  }

  /**
   * Increase scoreTeamB by 2
   */
  public void plussTwoForTeamB(View view) {
    scoreTeamB = scoreTeamB + 2;
    displayForTeamB(scoreTeamB);
  }

  public void resetScore(View view) {
    scoreTeamA = 0;
    scoreTeamB = 0;
    displayForTeamA(scoreTeamA);
    displayForTeamB(scoreTeamB);
  }

}
