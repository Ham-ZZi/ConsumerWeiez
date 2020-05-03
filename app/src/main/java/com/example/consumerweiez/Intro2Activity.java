package com.example.consumerweiez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro2Activity extends AppCompatActivity {

    Button loginButton;
    Button sign_upButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        loginButton = findViewById(R.id.loginBtn1);
        sign_upButton = findViewById(R.id.sign_upBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intro2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        sign_upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intro2Activity.this, SignupActivity.class);
                startActivity(intent1);
            }
        });


    }
}
