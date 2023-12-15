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
        Plant rose = new Plant("0", "장미", R.drawable.rose,".");
        plantList.add(rose);

        Plant sunflower = new Plant("1", "해바라기", R.drawable.sunflower,".");
        plantList.add(sunflower);

        Plant basil = new Plant("2", "바질", R.drawable.basil,"특징 : 바질은 특유의 향과 맛으로 인기 있는 허브 중 하나입니다. 봄이나 여름에 심을 수 있고, 집에서 쉽게 키울 수 있어 즐겨 키우는 허브로, 음식 조리에 활용할 수 있습니다.");
        plantList.add(basil);
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
