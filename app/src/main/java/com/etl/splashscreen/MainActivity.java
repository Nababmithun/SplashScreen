package com.etl.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    ImageView mainLogo;
    Animation rotate,scale;
    TextView appName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().getBooleanExtra("EXIT",false)){
            finish();
        }
        appName = findViewById(R.id.appName);
        mainLogo = findViewById(R.id.mainLogo);

        scale = AnimationUtils.loadAnimation(this,R.anim.eeees);
        rotate = AnimationUtils.loadAnimation(this,R.anim.rrrr);

        appName.startAnimation(scale);
        mainLogo.startAnimation(rotate);

    }
}
