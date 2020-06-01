package com.example.medtrack;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

//    private int notificationId = 1;
    private static int SPLASH_SCREEN = 5000;
    Animation topAnim;
    TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        logo = findViewById(R.id.textView);
        logo.setAnimation(topAnim);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

//        findViewById(R.id.setBtn).setOnClickListener(this);
//        findViewById(R.id.cancelBtn).setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        EditText editText = findViewById(R.id.editText);
//        TimePicker timePicker = findViewById(R.id.timePicker);
//
//        Intent intent = new Intent(MainActivity.this, AlarmReceiver.class);
//        intent.putExtra("notificationId", notificationId);
//        intent.putExtra("todo", editText.getText().toString());
//
//        PendingIntent alarmIntent = PendingIntent.getBroadcast(MainActivity.this,
//            0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//
//        AlarmManager alarm = (AlarmManager) getSystemService(ALARM_SERVICE);
//
//        switch(view.getId()) {
//            case R.id.setBtn:
//                int hour = timePicker.getCurrentHour();
//                int minute = timePicker.getCurrentMinute();
//
//                Calendar startTime = Calendar.getInstance();
//                startTime.set(Calendar.HOUR_OF_DAY, hour);
//                startTime.set(Calendar.MINUTE, minute);
//                startTime.set(Calendar.SECOND, 0);
//                long alarmStartTime = startTime.getTimeInMillis();
////                Intent intent1 = new Intent(MainActivity.this, AlarmReceiver.class);
////                PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0,intent1, PendingIntent.FLAG_UPDATE_CURRENT);
////                AlarmManager am = (AlarmManager) MainActivity.this.getSystemService(MainActivity.this.ALARM_SERVICE);
////                am.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
//
////                alarm.set(AlarmManager.RTC_WAKEUP, alarmStartTime, alarmIntent);
//                alarm.setRepeating(AlarmManager.RTC_WAKEUP, alarmStartTime, TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS), alarmIntent);
//
//                Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.cancelBtn:
//                alarm.cancel(alarmIntent);
//                Toast.makeText(this, "Canceled.", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }
}


//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
