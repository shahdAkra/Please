package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Duties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duties);
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
