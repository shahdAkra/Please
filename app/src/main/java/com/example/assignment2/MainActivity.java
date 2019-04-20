package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.content.Intent;
import android.widget.RatingBar;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import android.widget.RatingBar.OnRatingBarChangeListener;

public class MainActivity extends AppCompatActivity {
    private ListView listView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifeCycle","onCreateInvoked");



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






    //life cycle code starts here
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle","onStartInvoked");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("lifeCycle","onResumeInvoked");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifeCylce", "onPauseInvoked");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle", "OnStopInvoked");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroyInvoked");

    }

    //life cycle code ends here

}
