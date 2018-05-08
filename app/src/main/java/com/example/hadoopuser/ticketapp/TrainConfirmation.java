package com.example.hadoopuser.ticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrainConfirmation extends AppCompatActivity {

    private TextView name,age,source,destination,fare,schedule,flight;
    private Button btnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_confirmation);
        Intent i=getIntent();

        String sname=i.getStringExtra("name");
        String sage=i.getStringExtra("age");
        String ssource=i.getStringExtra("source");
        String sdestination=i.getStringExtra("destination");
        String sfare=i.getStringExtra("fare");
        String sschedule=i.getStringExtra("schedule");
        System.out.println("######################33"+sname);
        name=(TextView)findViewById(R.id.etname4);
        age=(TextView)findViewById(R.id.etage5);
        source=(TextView)findViewById(R.id.etsource5);
        destination=(TextView)findViewById(R.id.etdestination5);
        fare=(TextView)findViewById(R.id.etfare5);
        schedule=(TextView)findViewById(R.id.etschedule5);
        name.setText(sname);
        age.setText(sage);
        source.setText(ssource);
        destination.setText(sdestination);
        fare.setText(sfare);
        schedule.setText(sschedule);
        btnhome=(Button)findViewById(R.id.btnHome5);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),MainActivity.class);
                startActivity(i);
            }
        });



    }
}
