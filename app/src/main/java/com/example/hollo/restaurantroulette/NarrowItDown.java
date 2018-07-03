package com.example.hollo.restaurantroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NarrowItDown extends AppCompatActivity {

    public void mileseekbar(){
        SeekBar sb=(SeekBar)findViewById(R.id.milesBar);
        final TextView mileView = (TextView)findViewById(R.id.miles);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mileView.setText(String.valueOf(progress)+"mi");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void applyFilters(){
        Button filter = (Button)findViewById(R.id.applyfilterbutton);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent applyfilter = new Intent(NarrowItDown.this,MapsActivity2.class);
                startActivity(applyfilter);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narrow_it_down);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mileseekbar();
        applyFilters();
    }
}
