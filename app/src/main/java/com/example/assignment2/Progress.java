package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.TextView;

public class Progress extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView txtRatingValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

    }

    //rating bar code starts here
    public void OnRatingBar() {
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        txtRatingValue = (TextView) findViewById(R.id.txtRatingValue);
        //if rating value is changed,
        //display the current rating value in the result (textview) automatically
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,boolean fromUser) {
                txtRatingValue.setText(String.valueOf(rating));
            }
        });
    }//end of rating bar code





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
