package com.germanwords.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView userscore,finish,again;
        LottieAnimationView congu;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        userscore=findViewById(R.id.score);
        finish=findViewById(R.id.ende);
        again=findViewById(R.id.again);
        congu=findViewById(R.id.animationView);
        congu.playAnimation();
        String score=getIntent().getStringExtra(setdata.score);

        userscore.setText("Ihre Punktzahl ist "+score+" von "+10);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();


            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResultActivity.this,Question_activity.class);
                startActivity(intent);
                finish();

            }
        });



    }
}