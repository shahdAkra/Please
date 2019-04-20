package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Duties extends AppCompatActivity {
    TextView  taskOne ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duties);
        taskOne.findViewById(R.id.taskDescTxt);


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.menu_delet){

        }
        else if (id==R.id.menu_update){

        }

        return true;
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
