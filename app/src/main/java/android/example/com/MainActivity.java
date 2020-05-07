package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * adds 6 points to teamA
     */
    public void addSixTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 3 points to teamA
     */
    public void addThreeTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 1 point to teamA
     */
    public void addOneTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adds 2 points to TeamA
     */
    public void addTwoTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * adds 6 points to teamB
     */
    public void addSixTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 3 points to teamB
     */
    public void addThreeTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 1 point to teamB
     */
    public void addOneTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds 2 points to TeamB
     */
    public void addTwoTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the scores
     */
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * displays score for TeamA
     */
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * displays score for TeamB
     */
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
