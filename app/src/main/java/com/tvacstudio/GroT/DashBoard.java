package com.tvacstudio.GroT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    private Button mWorkingProfessional;
    private Button mHomeMaker;
    private Button mBachelor;
    private Button mJobSeeker;
    private Button mStudent;

    private Button mLogoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        mLogoutBtn = findViewById(R.id.logout_btn2);

        mWorkingProfessional = findViewById(R.id.workingprofessional_btn);
        mHomeMaker = findViewById(R.id.homemaker_btn);
        mBachelor = findViewById(R.id.bachelor_btn);
        mJobSeeker= findViewById(R.id.jobseeker_btn);
        mStudent = findViewById(R.id.student_btn);

        mWorkingProfessional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mHomeMaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mBachelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mJobSeeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        mLogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mAuth.signOut();
                sendUserToLogin();
            }
        });
    }

    private void sendUsertoTracker() {
        Intent loginIntent = new Intent(DashBoard.this, Tracker.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }

    private void sendUserToLogin() {
        Intent loginIntent = new Intent(DashBoard.this, LoginActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }
}