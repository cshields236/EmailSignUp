package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CardInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String mail = intent.getStringExtra("KEY1");
        int dur = Integer.parseInt(intent.getStringExtra("KEY2"));
        TextView q = findViewById(R.id.feeTV);



        if (dur <= 5){
            int fee = dur * 100;
            q.setText("€" + fee);
        }
        else{
            String e = String.valueOf(dur);
            double fee1 = (Double.parseDouble(e) * 100) * 0.8;
            q.setText("€" + fee1);
        }
        TextView f = findViewById(R.id.emailTV);
        f.setText(mail);
    }
}
