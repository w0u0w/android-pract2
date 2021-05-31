package ru.mirea.velikanov.lifecycleactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Act info",  "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("Act info",  "onRestoreInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Act info", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Act info",  "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Act info",  "onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Act info",  "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Act info",  "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Act info",  "onDestroy");
    }
}