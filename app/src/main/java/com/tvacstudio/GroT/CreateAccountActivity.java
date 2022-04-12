package com.tvacstudio.GroT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.regex.Pattern;

public class CreateAccountActivity extends AppCompatActivity {

    private EditText mUserName;
    private EditText mEmail;
    private EditText mPassword;
    private Button mCreateAccountBtn;
    private Button mCheckBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        mUserName = findViewById(R.id.username_text_view);
        mEmail = findViewById(R.id.email_text_view);
        mPassword = findViewById(R.id.password_text_view);

        mCreateAccountBtn = findViewById(R.id.create_account_btn2);
        mCheckBtn = findViewById(R.id.check_btn);

        mCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView musernameright = findViewById(R.id.username_right);
                ImageView musernamewrong = findViewById(R.id.username_wrong);
                ImageView memailright = findViewById(R.id.email_right);
                ImageView memailwrong = findViewById(R.id.email_wrong);
                ImageView mpasswordright = findViewById(R.id.password_right);
                ImageView mpasswordwrong = findViewById(R.id.password_wrong);

                String UserName = mUserName.getText().toString();
                String Email = mEmail.getText().toString();
                String Password = mPassword.getText().toString();

                boolean b1 = Pattern.matches("^(?:[0-9]+[a-z]|[a-z]+[0-9])[a-z0-9]*$", UserName);
                if (b1) {
                    musernameright.setVisibility(View.VISIBLE);
                    musernamewrong.setVisibility(View.INVISIBLE);
                } else {
                    musernameright.setVisibility(View.INVISIBLE);
                    musernamewrong.setVisibility(View.VISIBLE);
                }

                boolean b2 = Pattern.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", Email);
                if (b2) {
                    memailright.setVisibility(View.VISIBLE);
                    memailwrong.setVisibility(View.INVISIBLE);
                } else {
                    memailright.setVisibility(View.INVISIBLE);
                    memailwrong.setVisibility(View.VISIBLE);
                }

                boolean b3 = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", Password);
                if (b3) {
                    mpasswordright.setVisibility(View.VISIBLE);
                    mpasswordwrong.setVisibility(View.INVISIBLE);
                } else {
                    mpasswordright.setVisibility(View.INVISIBLE);
                    mpasswordwrong.setVisibility(View.VISIBLE);
                }
            }
        });

        mCreateAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoDashBoard();
            }
        });
    }

    private void sendUsertoDashBoard() {
        Intent loginIntent = new Intent(CreateAccountActivity.this, DashBoard.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }
}

