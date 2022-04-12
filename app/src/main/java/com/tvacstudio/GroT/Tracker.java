package com.tvacstudio.GroT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tracker extends AppCompatActivity {

    private Button mBack;
    private Button mManageGroceries;
    private Button mHomeMaintain;
    private Button mBills;
    private Button mToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        mBack = findViewById(R.id.back_btn);
        mManageGroceries = findViewById(R.id.managegroceries_btn);
        mHomeMaintain = findViewById(R.id.homemaintain_btn);
        mBills = findViewById(R.id.bills_btn);
        mToDo = findViewById(R.id.todo_btn);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoDashBoard();
            }
        });

        mManageGroceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoManageGroceries();
            }
        });

        mHomeMaintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoHomeMaintain();
            }
        });

        mBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoBills();
            }
        });

        mToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTodo();
            }
        });
    }

    private void sendUsertoDashBoard() {
        Intent loginIntent = new Intent(Tracker.this, DashBoard.class);
        startActivity(loginIntent);
    }

    private void sendUsertoManageGroceries() {
        Intent loginIntent = new Intent(Tracker.this, ManageGroceries.class);
        startActivity(loginIntent);
    }

    private void sendUsertoHomeMaintain() {
        Intent loginIntent = new Intent(Tracker.this, HomeMaintain.class);
        startActivity(loginIntent);
    }

    private void sendUsertoBills() {
        Intent loginIntent = new Intent(Tracker.this, Bills.class);
        startActivity(loginIntent);
    }

    private void sendUsertoTodo() {
        Intent loginIntent = new Intent(Tracker.this, Todo.class);
        startActivity(loginIntent);
    }
}