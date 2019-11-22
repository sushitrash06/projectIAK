package com.example.android.weebs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class wb4 extends AppCompatActivity {
    int nilai, jumlahCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb4);
        nilai = getIntent().getIntExtra("nilai4", 0);

        CheckBox[] cbJawaban = {                // bikin array dari checkbox yang isinya kumpulan checkbox jawaban
                findViewById(R.id.cb_yamada),      // https://developer.android.com/reference/java/util/Arrays.html
                findViewById(R.id.cb_chitoge),      // https://classroom.udacity.com/courses/ud839/lessons/7709673667/concepts/78832374510923
                findViewById(R.id.cb_hillegard),
                findViewById(R.id.cb_nico),
                findViewById(R.id.cb_rem),
                findViewById(R.id.cb_lucy),
                findViewById(R.id.cb_maika)
        };

        for (CheckBox cb : cbJawaban) {
            setCheckBoxCheckedListener(cb);
        }
    }
    private void setCheckBoxCheckedListener(final CheckBox cb){
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) { // event yang bakal jalan kalo ada perubahan check pada checkbox (mau di-check ataupun uncheck_
                if (cb.isChecked()) { // kalo misalnya perubahannya di-check
                    if (jumlahCheck < 4) {
                        jumlahCheck++; // kalo jumlah yang di-check masih kurang dari 3, tambahin jumlahCheck
                    } else {// kalo yang di-check udah 3 atau lebih
                        cb.setChecked(false); // uncheck yang habis di-check
                        Toast. makeText(getApplicationContext(), "Max 4 Answer", Toast.LENGTH_SHORT).show(); // tampilin notifikasi
                    }
                } else { // kalo perubahannya di-uncheck
                    jumlahCheck--; // kalo di-uncheck, kurangin jumlahCheck
                }
            }
        });
}
    public void check4(View v){
        CheckBox lucy = findViewById(R.id.cb_lucy);
        CheckBox hillegard = findViewById(R.id.cb_hillegard);
        CheckBox chitoge = findViewById(R.id.cb_chitoge);
        CheckBox yamada = findViewById(R.id.cb_yamada);

        Button buttonNext = findViewById(R.id.next4);
        if(lucy.isChecked() && hillegard.isChecked() && chitoge.isChecked() && yamada.isChecked()){
            nilai += 20;
            Toast.makeText(this, "U're Right!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "U're Wrong!", Toast.LENGTH_SHORT).show();
        }
        lucy.setBackgroundResource(R.color.colorBenar);
        hillegard.setBackgroundResource(R.color.colorBenar);
        chitoge.setBackgroundResource(R.color.colorBenar);
        yamada.setBackgroundResource(R.color.colorBenar);

        buttonNext.setEnabled(true);
        v.setEnabled(false);
    }

    public void next4(View v){
        Intent i = new Intent(this, hasil.class);
        i.putExtra("nilai4", nilai);
        startActivity(i);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}


