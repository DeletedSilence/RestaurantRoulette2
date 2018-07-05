package com.example.hollo.restaurantroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class NarrowItDown extends AppCompatActivity {

    public int mile = 0;
    public String keyword = "";
    int price = 99;

    public void mileseekbar(){
        SeekBar sb=(SeekBar)findViewById(R.id.milesBar);
        final TextView mileView = (TextView)findViewById(R.id.miles);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mile = progress;
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
                Intent intent = new Intent(NarrowItDown.this,MapsActivity2.class);
                intent.putExtra("place",keyword);
                intent.putExtra("price",price);
                intent.putExtra("mile",mile);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_narrow_it_down);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        checkboxes();
        mileseekbar();
        applyFilters();
    }

    public void checkboxes(){
        //CheckBox ch,ita,me,fr,ind,am,ja,tha;
        final CheckBox ch = (CheckBox)findViewById(R.id.checkChinese);
        final CheckBox ita = (CheckBox)findViewById(R.id.checkItalian);
        final CheckBox me = (CheckBox)findViewById(R.id.checkMexician);
        final CheckBox fr = (CheckBox)findViewById(R.id.checkFrench);
        final CheckBox ind = (CheckBox)findViewById(R.id.checkIndian);
        final CheckBox am = (CheckBox)findViewById(R.id.chackAmerican);
        final CheckBox ja = (CheckBox)findViewById(R.id.checkJapanese);
        final CheckBox tha = (CheckBox)findViewById(R.id.checkThai);
        final CheckBox cheap = (CheckBox)findViewById(R.id.checkCheap);
        final CheckBox medium = (CheckBox)findViewById(R.id.checkMedium);
        final CheckBox high = (CheckBox)findViewById(R.id.checkHigh);
        final CheckBox any = (CheckBox)findViewById(R.id.checkAny);

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch.isChecked()){
                    keyword = ch.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        ita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ita.isChecked()){
                    keyword = ita.getText().toString();
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(me.isChecked()){
                    keyword = me.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fr.isChecked()){
                    keyword = fr.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ind.isChecked()){
                    keyword = ind.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am.isChecked()){
                    keyword = am.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ja.isChecked()){
                    keyword = ja.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                    if(tha.isChecked()){
                        tha.toggle();
                    }
                }
            }
        });

        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tha.isChecked()){
                    keyword = tha.getText().toString();
                    if(ita.isChecked()){
                        ita.toggle();
                    }
                    if(me.isChecked()){
                        me.toggle();
                    }
                    if(fr.isChecked()){
                        fr.toggle();
                    }
                    if(ind.isChecked()){
                        ind.toggle();
                    }
                    if(am.isChecked()){
                        am.toggle();
                    }
                    if(ja.isChecked()){
                        ja.toggle();
                    }
                    if(ch.isChecked()){
                        ch.toggle();
                    }
                }
            }
        });

        any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(any.isChecked()){
                    if(cheap.isChecked()){
                        cheap.toggle();
                    }
                    if(medium.isChecked()){
                        medium.toggle();
                    }
                    if(high.isChecked()){
                        high.toggle();
                    }
                }
            }
        });

        cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cheap.isChecked()){
                    price = 1;
                    if(any.isChecked()){
                        any.toggle();
                    }
                    if(medium.isChecked()){
                        medium.toggle();
                    }
                    if(high.isChecked()){
                        high.toggle();
                    }
                }
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(medium.isChecked()){
                    price = 2;
                    if(cheap.isChecked()){
                        cheap.toggle();
                    }
                    if(any.isChecked()){
                        any.toggle();
                    }
                    if(high.isChecked()){
                        high.toggle();
                    }
                }
            }
        });

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(high.isChecked()){
                    price = 4;
                    if(cheap.isChecked()){
                        cheap.toggle();
                    }
                    if(medium.isChecked()){
                        medium.toggle();
                    }
                    if(any.isChecked()){
                        any.toggle();
                    }
                }
            }
        });

    }



}
