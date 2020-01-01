package com.example.sih_pothole;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.rbddevs.splashy.Splashy;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                }
                catch (InterruptedException e) { e.printStackTrace(); }
                finally {
                        Intent openMainActivity = new Intent(SplashActivity.this,MainActivity.class);

                    openMainActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(openMainActivity);

                }
            }
        };
        myThread.start();
    }

}
