package com.example.nishtha.yooo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button notibutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Noti);

        notibutton=(Button)findViewById(R.id.notibtn);
        Log.v("Inside Set on click","Inside onClick");

        notibutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent();
                Log.d("Inside Set on click","Inside onClick");
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,0,intent,0);

                Notification noti=new Notification.Builder(MainActivity.this)
                        .setTicker("Ticker")
                        .setContentTitle("New Notification")
                        .setContentText("Hey! You have a new notification :) ")
                        .setSmallIcon(R.drawable.noti)
                        .setContentIntent(pendingIntent).getNotification();
                //app will close nad notification gets cleared. try other options too.
                noti.flags=Notification.FLAG_AUTO_CANCEL;
                // important as the next two lines play with the android-os not the java file like above code that deals with android
                NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(0,noti);
            }
        });
    }
}
