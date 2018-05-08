package com.example.hadoopuser.ticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class TrainTicket extends AppCompatActivity {

    private EditText getname,getage,getsource,getdestination;
    private TextView getshedule,getfare;
    private Button btnsubmit,btnfare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_ticket);


        btnsubmit=(Button)findViewById(R.id.btnTrainBook);
        getage=(EditText) findViewById(R.id.etage4);
        getname=(EditText) findViewById(R.id.etname4);
        getsource=(EditText) findViewById(R.id.etsource4);
        getsource.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        getshedule.setText("");
        getfare.setText("");
        }
@Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        int timeStart = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        int timeEnd = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        getshedule.setText(timeStart+""+((timeEnd>5)?"am":"pm")+" - "+timeEnd+""+((timeStart>5)?"am":"pm"));

        }

        @Override
        public void afterTextChanged(Editable s) { }
        });
        getshedule = (TextView) findViewById(R.id.getShedule4);
        getfare=(TextView)findViewById(R.id.etfare4);
        getdestination=(EditText) findViewById(R.id.etdestination4);
        getdestination.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                getshedule.setText("");
                getfare.setText("");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int timeStart = ThreadLocalRandom.current().nextInt(1, 12 + 1);
                int timeEnd = ThreadLocalRandom.current().nextInt(1, 12 + 1);
                getshedule.setText(timeStart+""+((timeEnd>5)?"am":"pm")+" - "+timeEnd+""+((timeStart>5)?"am":"pm"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        btnsubmit=(Button)findViewById(R.id.btnTrainBook);
        btnfare=(Button)findViewById(R.id.btngetfare4);
        btnfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNum = ThreadLocalRandom.current().nextInt(100, 2000 + 1);
                getfare.setText(randomNum+"");

            }
        });
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),TrainConfirmation.class);
                i.putExtra("name",getname.getText()+"");
                System.out.println("######################33"+getname.getText());
                i.putExtra("age",getage.getText()+"");
                i.putExtra("source",getsource.getText()+"");
                i.putExtra("destination",getdestination.getText()+"");
                i.putExtra("fare",getfare.getText()+"");
                i.putExtra("schedule",getshedule.getText()+"");
                startActivity(i);
            }
        });

    }

    }
