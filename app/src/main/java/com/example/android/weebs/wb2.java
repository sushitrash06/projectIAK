package com.example.android.weebs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class wb2 extends AppCompatActivity {
    int nilai;
    private static final String TAG = "wb2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb2);
        nilai = getIntent().getIntExtra("nilai2", 0);
    }

    public void check2(View v) {
        EditText editAnswer = findViewById(R.id.kosong);
        String answer = editAnswer.getText().toString();
        if (!answer.isEmpty()) {
            if (answer.equalsIgnoreCase("fujoshi")) {
                nilai += 20;
                Toast.makeText(getApplicationContext(), "U're Right!!", Toast.LENGTH_SHORT).show();
                editAnswer.setBackgroundResource(R.color.colorBenar);
            } else {
                Toast.makeText(getApplicationContext(), "U're wrong!", Toast.LENGTH_SHORT).show();
                editAnswer.setBackgroundResource(R.color.colorSalah);
            }
            Button buttonNext = findViewById(R.id.next2);
            editAnswer.setEnabled(false);
            buttonNext.setEnabled(true);
            v.setEnabled(false);
        } else {
            Toast.makeText(this, "fill in the answer first!", Toast.LENGTH_SHORT).show();
        }
    }

    public void next2(View v) {
        Intent i = new Intent(this, wb3.class);
        i.putExtra("nilai2", nilai);
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
