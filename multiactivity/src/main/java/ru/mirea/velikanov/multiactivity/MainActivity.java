package ru.mirea.velikanov.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonact1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "МИРЭА - Великанов.В.Е");

        startActivity(intent);
    }

}