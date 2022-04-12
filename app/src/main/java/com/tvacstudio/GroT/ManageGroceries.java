package com.tvacstudio.GroT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ManageGroceries extends AppCompatActivity {

    private Button mBackBtn;
    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView qty1;
    private TextView qty2;
    private TextView qty3;
    private TextView qty4;
    private TextView unit1;
    private TextView unit2;
    private TextView unit3;
    private TextView unit4;

    private Button share1;
    private Button share2;
    private Button share3;
    private Button share4;
    private Button add1;
    private Button add2;
    private Button add3;
    private Button add4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_groceries);

        mBackBtn = findViewById(R.id.back_btn2);

        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        qty1 = findViewById(R.id.qty1);
        qty2 = findViewById(R.id.qty2);
        qty3 = findViewById(R.id.qty3);
        qty4 = findViewById(R.id.qty4);
        unit1 = findViewById(R.id.unit1);
        unit2 = findViewById(R.id.unit2);
        unit3 = findViewById(R.id.unit3);
        unit4 = findViewById(R.id.unit4);

        share1 = findViewById(R.id.share1);
        share2 = findViewById(R.id.share2);
        share3 = findViewById(R.id.share3);
        share4 = findViewById(R.id.share4);
        add1 = findViewById(R.id.add1);
        add2 = findViewById(R.id.add2);
        add3 = findViewById(R.id.add3);
        add4 = findViewById(R.id.add4);

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Grocery Details:";
                String shareSub =  item1.getText().toString()+": "+qty1.getText().toString()+" "+unit1.getText().toString()+" "+"left";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using:"));
            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Grocery Details:";
                String shareSub =  item2.getText().toString()+": "+qty2.getText().toString()+" "+unit2.getText().toString()+" "+"left";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using:"));
            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Grocery Details:";
                String shareSub =  item3.getText().toString()+": "+qty3.getText().toString()+" "+unit3.getText().toString()+" "+"left";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using:"));
            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Grocery Details:";
                String shareSub =  item4.getText().toString()+": "+qty4.getText().toString()+" "+unit4.getText().toString()+" "+"left";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                startActivity(Intent.createChooser(myIntent, "Share Using:"));
            }
        });

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add1.setVisibility(View.INVISIBLE);
                add2.setVisibility(View.VISIBLE);
                item2.setVisibility(View.VISIBLE);
                qty2.setVisibility(View.VISIBLE);
                unit2.setVisibility(View.VISIBLE);
                share2.setVisibility(View.VISIBLE);
            }
        });
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add2.setVisibility(View.INVISIBLE);
                add3.setVisibility(View.VISIBLE);
                item2.setVisibility(View.VISIBLE);
                qty2.setVisibility(View.VISIBLE);
                unit2.setVisibility(View.VISIBLE);
                share2.setVisibility(View.VISIBLE);
            }
        });
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add1.setVisibility(View.INVISIBLE);
                add2.setVisibility(View.VISIBLE);
                item2.setVisibility(View.VISIBLE);
                qty2.setVisibility(View.VISIBLE);
                unit2.setVisibility(View.VISIBLE);
                share2.setVisibility(View.VISIBLE);
            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });
    }

    private void sendUsertoTracker() {
        Intent loginIntent = new Intent(ManageGroceries.this, Tracker.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }


}
