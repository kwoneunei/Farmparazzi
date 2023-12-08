package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.btn1);

        loginButton.setOnClickListener(view -> {
            Intent loginIntent = new Intent(MainActivity.this, com.example.test.Login.class);
            startActivity(loginIntent);
        });

        Button signupButton = findViewById(R.id.button2);

        signupButton.setOnClickListener(view -> {
            Intent signupIntent = new Intent(MainActivity.this, com.example.test.Signup.class);
            startActivity(signupIntent);
        });


    }
}
