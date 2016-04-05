package com.cotanz.portfolio.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void spotify(View view){
        String message="This button will launch my spotify app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();
    }

    public void scores(View view){
        String message="This button will launch my scores app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();

    }

    public void library(View view){
        String message="This button will launch my library app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();
    }

    public void build(View view){
        String message="This button will launch my build app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();

    }

    public void xyz(View view){
        String message="This button will launch my xyz app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();
    }

    public void capstone(View view){
        String message="This button will launch my capstone app";
        int duration= Toast.LENGTH_SHORT;
        Toast.makeText(this,message,duration).show();

    }
}
