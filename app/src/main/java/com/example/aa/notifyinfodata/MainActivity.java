package com.example.aa.notifyinfodata;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeaitalActivity.class);
                PendingIntent activity = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
                NotificationManager systemService = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Notification builder = new NotificationCompat.Builder(MainActivity.this).setContentText("SSsss").setContentIntent(activity).setAutoCancel(true).setContentTitle("title")
                        .setSmallIcon(R.mipmap.ic_launcher).setSound(Uri.fromFile(new File("system/media/audio/ringtones/Luna.ogg")))
                        .setLights(Color.GREEN,1000,1000).setVibrate(new long[]{0,1000,1000,1000,10000}).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher))
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("sssssssssssssssswwwwwwwwwwssssssssssssss")).setPriority(Notification.PRIORITY_MAX).build();
                systemService.notify(1, builder);

            }
        });

    }
}
