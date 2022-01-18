package com.example.lifecycleactivity30112021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","Main : onCreate" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main : onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main : onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main : onPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main : onStop" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main : onRestart" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main : onDestroy" );
    }
}