package com.tvacstudio.GroT;

import android.app.DatePickerDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Calendar;


public class Todo extends AppCompatActivity {

    private Button mBack;
    private Button madd1;
    private Button madd2;
    private Button madd3;
    private CheckBox mcheck1;
    private CheckBox mcheck2;
    private CheckBox mcheck3;
    private EditText mtext1;
    private EditText mtext2;
    private EditText mtext3;
    private Button notify1;
    private Button notify2;
    private Button notify3;

    Context mcontext = this;
    private TextView mshowtime1;
    private Button mtime1;
    private TextView mshowdate1;
    private Button mdate1;
    private TextView mshowtime2;
    private Button mtime2;
    private TextView mshowdate2;
    private Button mdate2;
    private TextView mshowtime3;
    private Button mtime3;
    private TextView mshowdate3;
    private Button mdate3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        createNotificationChannel();

        mBack = findViewById(R.id.back_btn6);
        madd1 = findViewById(R.id.add_btn1);
        madd2 = findViewById(R.id.add_btn2);
        madd3 = findViewById(R.id.add_btn3);
        mcheck1 = findViewById(R.id.checkBox1);
        mcheck2 = findViewById(R.id.checkBox2);
        mcheck3 = findViewById(R.id.checkBox3);
        mtext1 = findViewById(R.id.edittext1);
        mtext2 = findViewById(R.id.edittext2);
        mtext3 = findViewById(R.id.edittext3);
        notify1 = findViewById(R.id.notify1);
        notify2 = findViewById(R.id.notify2);
        notify3 = findViewById(R.id.notify3);

        mshowtime1 = (TextView) findViewById(R.id.showtime1);
        mtime1 = (Button) findViewById(R.id.time1);
        mshowdate1 = (TextView) findViewById(R.id.showdate1);
        mdate1 = (Button) findViewById(R.id.date1);
        mshowtime2 = (TextView) findViewById(R.id.showtime2);
        mtime2 = (Button) findViewById(R.id.time2);
        mshowdate2 = (TextView) findViewById(R.id.showdate2);
        mdate2 = (Button) findViewById(R.id.date2);
        mshowtime3 = (TextView) findViewById(R.id.showtime3);
        mtime3 = (Button) findViewById(R.id.time3);
        mshowdate3 = (TextView) findViewById(R.id.showdate3);
        mdate3 = (Button) findViewById(R.id.date3);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendUsertoTracker();
            }
        });

        madd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madd1.setVisibility(View.INVISIBLE);
                madd2.setVisibility(View.VISIBLE);
                mcheck1.setVisibility(View.VISIBLE);
                mtext1.setVisibility(View.VISIBLE);
                mtime1.setVisibility(View.VISIBLE);
                mdate1.setVisibility(View.VISIBLE);
                notify1.setVisibility(View.VISIBLE);
            }
        });

        Calendar calender1 = Calendar.getInstance();
        final int hour = calender1.get(Calendar.HOUR_OF_DAY);
        final int minute = calender1.get(Calendar.MINUTE);

        mtime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timepickerdialog = new TimePickerDialog(mcontext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        mshowtime1.setText(i + ":" + i1);
                    }
                }, hour, minute, android.text.format.DateFormat.is24HourFormat(mcontext));
                timepickerdialog.show();
            }
        });

        mdate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datepickerdialog = new DatePickerDialog(mcontext, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        mshowdate1.setText(i2 + "/" + i1 + "/" + i);
                    }
                }, Calendar.getInstance().get(Calendar.YEAR),
                        Calendar.getInstance().get(Calendar.MONTH),
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                datepickerdialog.show();
            }
        });

        madd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madd2.setVisibility(View.INVISIBLE);
                madd3.setVisibility(View.VISIBLE);
                mcheck2.setVisibility(View.VISIBLE);
                mtext2.setVisibility(View.VISIBLE);
                mtime2.setVisibility(View.VISIBLE);
                mdate2.setVisibility(View.VISIBLE);
                notify2.setVisibility(View.VISIBLE);
            }
        });

        mtime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timepickerdialog = new TimePickerDialog(mcontext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        mshowtime2.setText(i + ":" + i1);
                    }
                }, hour, minute, android.text.format.DateFormat.is24HourFormat(mcontext));
                timepickerdialog.show();
            }
        });

        mdate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datepickerdialog = new DatePickerDialog(mcontext, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        mshowdate2.setText(i2 + "/" + i1 + "/" + i);
                    }
                }, Calendar.getInstance().get(Calendar.YEAR),
                        Calendar.getInstance().get(Calendar.MONTH),
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                datepickerdialog.show();
            }
        });

        madd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcheck3.setVisibility(View.VISIBLE);
                mtext3.setVisibility(View.VISIBLE);
                mtime3.setVisibility(View.VISIBLE);
                mdate3.setVisibility(View.VISIBLE);
                notify3.setVisibility(View.VISIBLE);
            }
        });

        mtime3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialog timepickerdialog = new TimePickerDialog(mcontext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        mshowtime3.setText(i + ":" + i1);
                    }
                }, hour, minute, android.text.format.DateFormat.is24HourFormat(mcontext));
                timepickerdialog.show();
            }
        });

        mdate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datepickerdialog = new DatePickerDialog(mcontext, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        mshowdate3.setText(i2 + "/" + i1 + "/" + i);
                    }
                }, Calendar.getInstance().get(Calendar.YEAR),
                        Calendar.getInstance().get(Calendar.MONTH),
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
                datepickerdialog.show();
            }
        });

        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "GroT")
                .setSmallIcon(R.drawable.grot_logo_1000_900x300)
                .setContentTitle("Notification from GroT")
                .setContentText("You hav added an activity to your ToDo List")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        final NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);

        notify1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationManagerCompat.notify(100, builder.build());
            }
        });

        notify2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationManagerCompat.notify(100, builder.build());
            }
        });

        notify3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationManagerCompat.notify(100, builder.build());
            }
        });
    }

    private void sendUsertoTracker() {
        Intent loginIntent = new Intent(Todo.this, Tracker.class);
        startActivity(loginIntent);
    }

    private void createNotificationChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "GroT Channel";
            String description = "Channel from GroT Notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("GroT", name, importance);
            channel.setDescription(description);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}