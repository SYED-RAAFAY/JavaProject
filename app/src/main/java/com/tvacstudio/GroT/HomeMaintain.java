package com.tvacstudio.GroT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class HomeMaintain extends AppCompatActivity {

    private Button mBack;
    private Button mMilkRed;
    private Button mMilkGreen;
    private Button mPaperRed;
    private Button mPaperGreen;
    private Button mMaidRed;
    private Button mMaidGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_maintain);

        mBack = findViewById(R.id.back_btn3);
        mMilkRed = findViewById(R.id.milk_red);
        mMilkGreen = findViewById(R.id.milk_green);
        mPaperRed = findViewById(R.id.paper_red);
        mPaperGreen = findViewById(R.id.paper_green);
        mMaidRed = findViewById(R.id.maid_red);
        mMaidGreen = findViewById(R.id.maid_green);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mMilkRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMilkGreen.setVisibility(View.VISIBLE);
                mMilkRed.setVisibility(View.INVISIBLE);
            }
        });
        mMilkGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMilkRed.setVisibility(View.VISIBLE);
                mMilkGreen.setVisibility(View.INVISIBLE);
            }
        });

        mPaperRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaperGreen.setVisibility(View.VISIBLE);
                mPaperRed.setVisibility(View.INVISIBLE);
            }
        });
        mPaperGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPaperRed.setVisibility(View.VISIBLE);
                mPaperGreen.setVisibility(View.INVISIBLE);
            }
        });

        mMaidRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMaidGreen.setVisibility(View.VISIBLE);
                mMaidRed.setVisibility(View.INVISIBLE);
            }
        });
        mMaidGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMaidRed.setVisibility(View.VISIBLE);
                mMaidGreen.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void sendUsertoTracker() {
        Intent loginIntent = new Intent(HomeMaintain.this, Tracker.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }
}