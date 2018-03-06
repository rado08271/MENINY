package com.example.rafig.meniny;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listOfNames;
    String[] name;
    String[] date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //calling resources
        Resources res = getResources();
        listOfNames = (ListView) findViewById(R.id.listOfNames);
        name = res.getStringArray(R.array.name);
        date = res.getStringArray(R.array.date);

        ItemAdapter itemAdapter = new ItemAdapter(this, name, date);
        listOfNames.setAdapter(itemAdapter);

    }
}
