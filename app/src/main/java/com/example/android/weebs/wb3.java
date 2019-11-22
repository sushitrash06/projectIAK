package com.example.android.weebs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class wb3 extends AppCompatActivity {
    int nilai;
    private static final String TAG = "wb3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb3);
        nilai = getIntent().getIntExtra("nilai3", 0);

    }

    public void check3(View v) {
        RadioGroup rg = findViewById(R.id.jawaban2);
        int radioButtonCheckedId = rg.getCheckedRadioButtonId();


        if (radioButtonCheckedId != -1) {
            if (radioButtonCheckedId == R.id.rb2) {
                nilai += 30;
                Toast.makeText(getApplicationContext(), "U're Right!!", Toast.LENGTH_SHORT).show();
                findViewById(R.id.rb2).setBackgroundResource(R.color.colorBenar);
            } else {
                Toast.makeText(getApplicationContext(), "U're wrong!", Toast.LENGTH_SHORT).show();
                findViewById(radioButtonCheckedId).setBackgroundResource(R.color.colorSalah);
                findViewById(R.id.rb2).setBackgroundResource(R.color.colorBenar);
            }

            for (int i = 0; i < rg.getChildCount(); i++) {
                rg.getChildAt(i).setEnabled(false);
            }

            Button buttonNext = findViewById(R.id.next3);
            buttonNext.setEnabled(true);
            v.setEnabled(false);
        } else {
            Toast.makeText(getApplicationContext(), "Choose your question first!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void next3(View v) {
        Intent i = new Intent(this, wb4.class);
        i.putExtra("nilai3", nilai);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();


    }
}