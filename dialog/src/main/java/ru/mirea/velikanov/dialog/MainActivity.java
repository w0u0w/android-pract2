package ru.mirea.velikanov.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");

    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Офкорс\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Не люблю бургеры\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickTimeDialog(View view) {
        DialogFragment timeDialogFragment = new TimePickerFragment();
        timeDialogFragment.show(getSupportFragmentManager(), "time picker");

    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView timeText = (TextView)findViewById(R.id.txVw2);
        timeText.setText("Hour: " + hourOfDay + " Minutes: " + minute);
    }


    public void onClickDateDialog(View view) {
        DialogFragment dateDialogFragment = new DatePickerFragment();
        dateDialogFragment.show(getSupportFragmentManager(), "date picker");

    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = (Calendar.getInstance());
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        TextView dateText = (TextView)findViewById(R.id.dateText);
        dateText.setText(currentDateString);
    }

    public void onClickProgressDialog(View view) {
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.show();
        progressDialog.setContentView(R.layout.progressdialog);
        progressDialog.getWindow().setBackgroundDrawableResource(
                android.R.color.transparent
        );
    }

    @Override
    public void onBackPressed() {
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.dismiss();
    }
}