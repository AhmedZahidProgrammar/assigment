package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyAdapter listAdapter;
    private ArrayList<Contact> contactsList = new ArrayList<>();
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);
        listAdapter = new MyAdapter(contactsList, this);
        recycler.setAdapter(listAdapter);

        //Load the date from the network or other resources
        //into the array list asynchronously

        contactsList.add(new Contact("Daniel Shiffman", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jhon Doe", "778899009"));
        contactsList.add(new Contact("Jane Doe", "778899009"));

        listAdapter.notifyDataSetChanged();
    }
}