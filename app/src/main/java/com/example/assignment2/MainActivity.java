package com.example.assignment2;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, Duties.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(MainActivity.this, ToDo.class);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(MainActivity.this, Progress.class);
                    startActivity(intent);
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }


}
