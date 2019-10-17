package com.example.activityproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladesh, india, usa, germany, canada, london;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladesh = findViewById(R.id.bangladesh_id);
        india = findViewById(R.id.india_id);
        usa = findViewById(R.id.usa_id);
        germany = findViewById(R.id.germany_id);
        canada = findViewById(R.id.canada_id);
        london = findViewById(R.id.london_id);

        bangladesh.setOnClickListener(this);
        india.setOnClickListener(this);
        usa.setOnClickListener(this);
        germany.setOnClickListener(this);
        canada.setOnClickListener(this);
        london.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bangladesh_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.india_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }
        if (v.getId()==R.id.usa_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "usa");
            startActivity(intent);
        }
        if (v.getId()==R.id.germany_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "germany");
            startActivity(intent);
        }
        if (v.getId()==R.id.canada_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "canada");
            startActivity(intent);
        }
        if (v.getId()==R.id.london_id){
            intent = new Intent(MainActivity.this, CountryHistory.class);
            intent.putExtra("name", "london");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();    //Exit
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Stay on this page", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
