package com.example.assignment1;
//Name: Conor Shields
//Student Number: C16312523
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view){


        EditText e = findViewById(R.id.emailTxt);
        String email = e.getText().toString();
        EditText p1 = findViewById(R.id.pwTxt);
        String password = p1.getText().toString();
        EditText p2 = findViewById(R.id.confrimPwTxt);
        String confirmPW = p2.getText().toString();
        EditText p3 = findViewById(R.id.durationTxt);
        String duration = p3.getText().toString();

        if (!email.contains("@") ||  String.valueOf(email.charAt(0)).equals("@") || String.valueOf(email.charAt(email.length() - 1)).equals("@") || email.contains(" "))
        {
            Toast.makeText(this,"Invalid Emaill " , Toast.LENGTH_LONG).show();

        }
        else if( !password.equals(confirmPW)  ){
            Toast.makeText(this,"Password must match " , Toast.LENGTH_LONG).show();
        }else if(password.length() < 6 || password.contains(" ") ){
            Toast.makeText(this,"Invalid Password " , Toast.LENGTH_LONG).show();
        }
        else if(Integer.valueOf(duration) <=0)
        {
            Toast.makeText(this,"Invalid Number of Years " , Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this, CardInfo.class);
            intent.putExtra("KEY1", email);
            intent.putExtra("KEY2", duration);
            startActivity(intent);
        }


    }
}
