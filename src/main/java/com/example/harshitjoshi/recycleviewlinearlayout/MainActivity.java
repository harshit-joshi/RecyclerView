package com.example.harshitjoshi.recycleviewlinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> quoteName = new ArrayList<>(Arrays.asList("Always Be Fearless", "Give Your Best", "Last Shot or Final Opportunity", "Never Regret Your Past", "Some Words", "Sometime be Casual",
            "Be a Warrior", "Your Life"));
    ArrayList<Integer> imageQuote = new ArrayList<>(Arrays.asList(R.drawable.befearless, R.drawable.giveyourbest, R.drawable.lastshot, R.drawable.neverregret, R.drawable.somewords, R.drawable.sometimecasual, R.drawable.warrior, R.drawable.yourlife));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter customAdapter = new CustomAdapter(quoteName, imageQuote,null);
        recyclerView.setAdapter(customAdapter);
    }
}