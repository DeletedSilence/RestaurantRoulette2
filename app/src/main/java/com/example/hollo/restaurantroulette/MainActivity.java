package com.example.hollo.restaurantroulette;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void narrow(){
        Button narrow = (Button)findViewById(R.id.narrowbutton);
        narrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent narrowitdown = new Intent(MainActivity.this,NarrowItDown.class);
                startActivity(narrowitdown);
            }
        });
    }
    public void randomize(){
        Button random = (Button)findViewById(R.id.randombutton);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomizeit = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(randomizeit);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        narrow();
        randomize();
        RelativeLayout home = findViewById(R.id.homescreen);
        ImageView animate = (ImageView)findViewById(R.id.animatefood);
        AnimationDrawable animation=(AnimationDrawable)animate.getDrawable();
        animation.setEnterFadeDuration(2000);
        animation.setExitFadeDuration(4000);
        animation.start();
        /*AnimationDrawable animationDrawable=(AnimationDrawable)home.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        //toolbar.setTitle("Restaurant Roulette");

        /*Button random = (Button)findViewById(R.id.randombutton);
        //Button narrow = (Button)findViewById(R.id.narrowbutton);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Randomizing",Toast.LENGTH_LONG).show();
            }
        });
        narrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Narrowing",Toast.LENGTH_LONG).show();
            }
        });*/
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
}
