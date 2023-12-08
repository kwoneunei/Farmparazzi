package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.view.View;

public class DicActivity extends AppCompatActivity {
    public static ArrayList<Plant> plantList = new ArrayList<Plant>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dic);
        setUpData();
        setUpList();
        setUpOnClickListener();
    }

    private void setUpData() {
        Plant rose = new Plant("0", "rose", R.drawable.rose);
        plantList.add(rose);

        Plant rose2 = new Plant("1", "rose2", R.drawable.rose);
        plantList.add(rose2);
    }

    private void setUpList() {
        listView = findViewById(R.id.plant_listView);
        PlantAdapter adapter = new PlantAdapter(getApplicationContext(), 0, plantList);
        listView.setAdapter(adapter);
    }

    private void setUpOnClickListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Plant selectedPlant = (Plant) adapterView.getItemAtPosition(position);
                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
                showDetail.putExtra("id", selectedPlant.getId());
                startActivity(showDetail);
            }
        });
    }
}
