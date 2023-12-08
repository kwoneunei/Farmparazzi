package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button myPageButton = findViewById(R.id.button3);
        Button myPlantButton = findViewById(R.id.button4);
        Button PostFeedButton = findViewById(R.id.button5);
        Button TodayPlantButton = findViewById(R.id.button6);
        Button RecPlantButton = findViewById(R.id.button7);
        Button DicPlantButton = findViewById(R.id.button8);

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyPageActivity();
            }
        });

        myPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMyPlantActivity();
            }
        });

        PostFeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPostFeedActivity();
            }
        });

        TodayPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTodayPlantActivity();
            }
        });

        DicPlantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDicActivity();
            }
        });

        // You can add more initialization or setup code here if needed
    }

    // Method to handle the '마이페이지' button click
    private void openMyPageActivity() {
        Intent intent = new Intent(getApplicationContext(), My_Page.class);
        startActivity(intent);
    }

    // Method to handle the 'My Plant' button click
    private void openMyPlantActivity() {
        Intent intent = new Intent(getApplicationContext(), My_Plant.class);
        startActivity(intent);
    }


    private void openPostFeedActivity() {
        Intent intent = new Intent(getApplicationContext(), Post_Feed.class);
        startActivity(intent);
    }

    private void openTodayPlantActivity() {
        Intent intent = new Intent(getApplicationContext(), Today_Plant.class);
        startActivity(intent);
    }

    private void openDicActivity() {
        Intent intent = new Intent(getApplicationContext(), DicActivity.class);
        startActivity(intent);
    }
}
