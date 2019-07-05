package com.example.nishtha.scorekeeper;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int scoreA=0,scoreB=0;
    Button a3,a2,afree,bfree,b3,b2,reset;
    AnimationDrawable animationDrawable;
    ConstraintLayout mConstraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorekeeeper);

        mConstraintLayout=(ConstraintLayout)findViewById(R.id.idd);
        animationDrawable=(AnimationDrawable)mConstraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

       a3=(Button)findViewById(R.id.a3);
       a2=(Button)findViewById(R.id.a2);
       afree=(Button)findViewById(R.id.afree);
       b3=(Button)findViewById(R.id.b3);
       b2=(Button)findViewById(R.id.b2);
       bfree=(Button)findViewById(R.id.bfree);
       reset=(Button)findViewById(R.id.reset);

        final TextView twA=(TextView)findViewById(R.id.ascore);
        final TextView twB=(TextView)findViewById(R.id.bscore);
        twA.setText(String.valueOf(scoreA));
        twB.setText(String.valueOf(scoreB));

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA+=3;
                twA.setText(String.valueOf(scoreA));
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA+=2;
                twA.setText(String.valueOf(scoreA));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB+=3;
                twB.setText(String.valueOf(scoreB));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB+=2;
                twB.setText(String.valueOf(scoreB));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA=0;
                scoreB=0;
                twA.setText(String.valueOf(scoreA));
                twB.setText(String.valueOf(scoreB));
            }
        });
        bfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // scoreB+=1;
                twB.setText("FREE THROW");
            }
        });
        afree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // scoreA+=1;
                twA.setText("FREE THROW");
            }
        });


    }
}
