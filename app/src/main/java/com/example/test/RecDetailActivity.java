package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecDetailActivity extends AppCompatActivity {
    Plant selectedPlant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plant);

        getSelectedPlant();

        setValues();
    }

    private void setValues() {
        TextView tv=findViewById(R.id.plant_detail_name);
        ImageView iv=findViewById(R.id.plant_detail_image);

        tv.setText(selectedPlant.getName());
        iv.setImageResource(selectedPlant.getImage());
    }

    private void getSelectedPlant(){
        Intent intent =getIntent();
        String id=intent.getStringExtra("id");
        selectedPlant=DicActivity.plantList.get(Integer.valueOf(id));
    }
}