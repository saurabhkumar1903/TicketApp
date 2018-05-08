package com.example.hadoopuser.ticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button cs;
    private RadioButton tt;
    private RadioButton ft;
    private RadioButton selected;
    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cs=(Button)findViewById(R.id.cs);
        tt=(RadioButton)findViewById(R.id.tt);
        ft=(RadioButton)findViewById(R.id.ft);
        rg=(RadioGroup) findViewById(R.id.rg);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chkd_id=rg.getCheckedRadioButtonId();
                selected=findViewById(chkd_id);
                if(selected.getText().equals("Train Ticket"))
                {
                    Intent i1=new Intent(v.getContext(),TrainTicket.class);
                    startActivity(i1);
                 }

                else if(selected.getText().equals("Flight Ticket"))
                {
                    Intent i2=new Intent(v.getContext(),FlightTicket.class);
                    startActivity(i2);

                }
            }
        });
    }

}
