package com.ni___ckel.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textViewOnCreate;
    public TextView textViewOnStart;
    public TextView textViewOnPause;
    public TextView textViewOnStop;
    public TextView textViewOnDestroy;
    public TextView textViewOnRestart;
    public TextView textViewOnResume;
    public Button buttonTest;
    public Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        textViewOnCreate.setText("OnCreate has been done");

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewOnCreate.setText("..!..Create");
                textViewOnStart.setText("..!..Start");
                textViewOnPause.setText("..!..Pause");
                textViewOnStop.setText("..!..Stop");
                textViewOnDestroy.setText("..!..Destroy");
                textViewOnRestart.setText("..!..Restart");
                textViewOnResume.setText("..!..Resume");
            }
        });

    }



    @Override
    protected void onStart() {
        super.onStart();
        textViewOnStart.setText("OnStart has been done");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textViewOnStop.setText("OnStop has been done");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textViewOnDestroy.setText("OnDestroy has been done");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textViewOnPause.setText("OnPause has been done");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textViewOnResume.setText("OnResume has been done");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textViewOnRestart.setText("OnRestart has been done");
    }

    private void initViews() {
        textViewOnCreate = findViewById(R.id.textViewOnCreate);
        textViewOnStart = findViewById(R.id.textViewOnStart);
        textViewOnPause = findViewById(R.id.textViewOnPause);
        textViewOnStop = findViewById(R.id.textViewOnStop);
        textViewOnDestroy = findViewById(R.id.textViewOnDestroy);
        textViewOnRestart = findViewById(R.id.textViewOnRestart);
        textViewOnResume = findViewById(R.id.textViewOnResume);
        buttonTest = findViewById(R.id.buttonTest);
        buttonNext = findViewById(R.id.buttonNext);
    }



}


