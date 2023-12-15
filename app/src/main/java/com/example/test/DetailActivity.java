package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
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
        TextView t_v=findViewById(R.id.plant_detail_feature);

        tv.setText(selectedPlant.getName());
        iv.setImageResource(selectedPlant.getImage());
        t_v.setText(selectedPlant.getFeature());
    }

    private void getSelectedPlant(){
        Intent intent =getIntent();
        String id=intent.getStringExtra("id");
        selectedPlant=DicActivity.plantList.get(Integer.valueOf(id));
    }
}