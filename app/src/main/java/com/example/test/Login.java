package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView sign;
    // 코드에서 정의된 뷰 엘리먼트들
    EditText login_email, login_password;
    Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 회원가입 버튼
        sign = findViewById(R.id.signin);

        // 회원가입 버튼 클릭시, 회원가입 페이지로 이동
        sign.setOnClickListener(v -> {
            Intent intent = new Intent(this, Signup.class);
            startActivity(intent);
        });

        // 로그인 버튼
        login_button = findViewById(R.id.loginbutton);

        // 로그인 버튼 클릭시, Home 액티비티로 이동
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Home 액티비티로 이동
                Intent intent = new Intent(Login.this, Home.class);
                startActivity(intent);
            }
        });
    }
}


