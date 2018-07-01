package com.example.hollo.restaurantroulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narrow_it_down);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mileseekbar();
    }
}
