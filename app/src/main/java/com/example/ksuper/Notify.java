package com.example.ksuper;

import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.ksuper.App.CHANNEL_1_ID;
import static com.example.ksuper.App.CHANNEL_2_ID;



public class Notify extends AppCompatActivity {
    private NotificationManagerCompat notificationManager;
    private EditText editTextTitle;
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        notificationManager=NotificationManagerCompat.from(this);
        editTextTitle=findViewById(R.id.title);
        editTextMessage=findViewById(R.id.message);


    }
    public void sendOnChannelA(View v){
        String title=editTextTitle.getText().toString();
        String message=editTextMessage.getText().toString();
        Notification notification=new NotificationCompat.Builder(this, CHANNEL_1_ID)

                .setSmallIcon(R.drawable.ic_one)

                .setContentTitle(title)

                .setContentTitle(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(1,notification);

    }
    public void sendOnChannelB(View v){
        String title=editTextTitle.getText().toString();
        String message=editTextMessage.getText().toString();
        Notification notification=new NotificationCompat.Builder(this,CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_two)
                .setContentTitle(title)
                .setContentTitle(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)

                .build();

        notificationManager.notify(2,notification);

    }

}

