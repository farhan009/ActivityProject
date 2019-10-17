package com.example.activityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryHistory extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_history);

        imageView = findViewById(R.id.imageView_id);
        textView = findViewById(R.id.textView_id);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            String value = bundle.getString("name");
            showDetails(value);
        }
    }

    public void showDetails(String value){
        if (value.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_img);
            textView.setText(R.string.bangladesh_history);
        }
        if (value.equals("india")){
            imageView.setImageResource(R.drawable.india_img);
            textView.setText(R.string.india_history);
        }
        if (value.equals("usa")){
            imageView.setImageResource(R.drawable.usa_img);
            textView.setText(R.string.usa_history);
        }
        if (value.equals("germany")){
            imageView.setImageResource(R.drawable.germany_img);
            textView.setText(R.string.germany_history);
        }
        if (value.equals("canada")){
            imageView.setImageResource(R.drawable.canada_img);
            textView.setText(R.string.canada_history);
        }
        if (value.equals("london")){
            imageView.setImageResource(R.drawable.london_img);
            textView.setText(R.string.london_history);
        }
    }
}
