package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Date;

public class Post_Feed extends AppCompatActivity {
    private ListView listView;
    private ListAdapter listAdapter;
    private ArrayList<List_Item> list_itemArrayList;
    private EditText titleEditText, contentEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_feed);
        listView = (ListView)findViewById(R.id.feed);
        list_itemArrayList = new ArrayList<List_Item>();
        list_itemArrayList.add(
                new List_Item(R.mipmap.ic_launcher,"보라돌이","제목1",new Date(System.currentTimeMillis()),"내용1"));
        list_itemArrayList.add(
                new List_Item(R.mipmap.ic_launcher,"뚜비","제목2",new Date(System.currentTimeMillis()),"내용2"));
        list_itemArrayList.add(
                new List_Item(R.mipmap.ic_launcher,"나나","제목3",new Date(System.currentTimeMillis()),"내용3"));
        list_itemArrayList.add(
                new List_Item(R.mipmap.ic_launcher,"뽀","제목4",new Date(System.currentTimeMillis()),"내용4"));
        list_itemArrayList.add(
                new List_Item(R.mipmap.ic_launcher,"햇님","제목5",new Date(System.currentTimeMillis()),"내용5"));

        // Initialize your ArrayList and adapter
        list_itemArrayList = new ArrayList<>();
        listAdapter = new ListAdapter(this, list_itemArrayList);

        // Find and set the adapter for your ListView
        listView = findViewById(R.id.feed);
        listView.setAdapter(listAdapter);

        // Button to add a new item
        Button addButton = findViewById(R.id.button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add a new item when the button is clicked
                addNewItemToList();
            }
        });

    }

    private void addNewItemToList() {
        // Add a new item to your ArrayList and update the adapter
        List_Item newItem = new List_Item(
                R.mipmap.ic_launcher,
                "New User",  // Replace with the actual nickname or get it from the user input
                titleEditText.getText().toString(),
                new Date(System.currentTimeMillis()),
                contentEditText.getText().toString()
        );
        list_itemArrayList.add(newItem);
        listAdapter.notifyDataSetChanged();

    }
}