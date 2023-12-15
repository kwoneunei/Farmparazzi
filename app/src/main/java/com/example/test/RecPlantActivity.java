package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RecPlantActivity extends AppCompatActivity {
    private ArrayList<Rec_Plant> recplantList = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_plant);
        setUpData();
        setUpList();
        setUpOnClickListener();
    }

    private void setUpData() {
        Rec_Plant rose = new Rec_Plant("0", "rose", R.drawable.rose);
        recplantList.add(new Rec_Plant(rose.getrecId(), rose.getrecName(), rose.getrecImage()));

        Rec_Plant rose2 = new Rec_Plant("1", "rose2", R.drawable.rose);
        recplantList.add(new Rec_Plant(rose2.getrecId(), rose2.getrecName(), rose2.getrecImage()));
    }

    private void setUpList() {
        listView = findViewById(R.id.listView14);
        Rec_Plant_Adapter adapter = new Rec_Plant_Adapter(getApplicationContext(), 0, recplantList);
        listView.setAdapter(adapter);
    }

    private void setUpOnClickListener() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Rec_Plant selectedRecPlant = (Rec_Plant) adapterView.getItemAtPosition(position);
                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
                showDetail.putExtra("id", selectedRecPlant.getrecId());
                startActivity(showDetail);
            }
        });
    }
}
