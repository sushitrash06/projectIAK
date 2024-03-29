package com.example.android.weebs;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class soal1 extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private soal mQuestions = new soal();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        


            r = new Random();

            answer1 = (Button) findViewById(R.id.answer1);
            answer2 = (Button) findViewById(R.id.answer2);
            answer3 = (Button) findViewById(R.id.answer3);
            answer4 = (Button) findViewById(R.id.answer4);

            score = (TextView) findViewById(R.id.score);
            question = (TextView) findViewById(R.id.question);

            score.setText("Score: " + mScore);

            updateQuestion(r.nextInt(mQuestionsLength));

            answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer1.getText() == mAnswer) {
                        mScore++;
                        score.setText("Score :" + mScore);
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        gameOver();
                    }

                }
            });

            answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer2.getText() == mAnswer) {
                        mScore++;
                        score.setText("Score :" + mScore);
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        gameOver();
                    }
                }
            });

            answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer3.getText() == mAnswer) {
                        mScore++;
                        score.setText("Score " + mScore);
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        gameOver();
                    }
                }
            });

            answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (answer4.getText() == mAnswer) {
                        mScore++;
                        score.setText("Score :" + mScore);
                        updateQuestion(r.nextInt(mQuestionsLength));
                    } else {
                        gameOver();
                    }
                }
            });
        }

    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(soal1.this);
        alertDialogBuilder
                .setMessage("Game Over! your score: " + mScore + "poin.")
                .setCancelable(false)
                .setPositiveButton("try again?",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), soal1.class));
                            }
                        })
                .setNegativeButton("exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
    public void onBackPressed(){
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

}


