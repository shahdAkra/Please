package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


import com.example.model.ITaskModel;
import com.example.model.ModelFactory;
import android.support.v4.app.DialogFragment;
import java.util.Date;


import com.example.model.Task;

public class ToDo extends AppCompatActivity {
    private EditText nameEdt ;
    private EditText descEdt;
    private EditText dateEdt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        nameEdt = (EditText)findViewById(R.id.nameEdt);
        descEdt =(EditText)findViewById(R.id.descEdt);
        dateEdt = (EditText)findViewById(R.id.dateId);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id==R.id.menu_delet){

        }
        else if (id==R.id.menu_update){

        }

        return true;
    }


    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new DialogFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
    public void AddNew(View view) {
        String name = nameEdt.getText().toString();
        String desc = descEdt.getText().toString();
        Date date = new Date ();


        ModelFactory factory = new ModelFactory();
        ITaskModel model = factory.getModel();
        model.add(name, desc,date);


    }

    public void update(){

        String name = nameEdt.getText().toString();
        String desc = descEdt.getText().toString();
        Date date = new Date ();

        Task task = new Task (name, desc,date);

        ModelFactory factory = new ModelFactory();
        ITaskModel model = factory.getModel();
        model.update(1, task);

    }


    public void delete(){

        ModelFactory factory = new ModelFactory();
        ITaskModel model = factory.getModel();
        model.delete(1);
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
