package com.example.android.weebs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void riddle(View view) {
        Intent i = new Intent(this, depan.class);
        startActivity(i);
    }

    public void weeb(View view) {
        Intent i = new Intent(this, depan2.class);
        startActivity(i);

    }
}
