//Author Adilbek Nurmakov 
package com.example.kazair;
//KazAir
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = findViewById(R.id.textView3);
        textView.setText("The KazAir application shows the real-Time Air Quality Index (AQI) for tree Kazakhstan cities - Astana, Almaty and Karaganda\n" +
                "\n" +
                "The KazAir uses PM2.5 data sensors to shows the level of polution in regions of the cities.\n" +
                "\n" +
                "The PM2.5 data is updated every 10 sec to show the updated values, please, press the refresh button.\n");
       TextView textView1 = findViewById(R.id.textView4);
       textView1.setText("If you want to know about PM2.5 and more, please, visit airkaz.org website.");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_home) {
            Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    }


