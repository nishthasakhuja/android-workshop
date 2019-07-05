package com.example.nishtha.loginpage;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uname,pwrd;
    Button login;
    AnimationDrawable animationDrawable;
    ConstraintLayout mConstraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText)findViewById(R.id.uname);
        pwrd=(EditText)findViewById(R.id.pwrd);
        login=(Button)findViewById(R.id.login);
        mConstraintLayout=(ConstraintLayout)findViewById(R.id.id1);
        animationDrawable=(AnimationDrawable)mConstraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=uname.getText().toString();
                String summary="Name= "+name;
                String subject="Hey! This is a Coffee App";
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:sakhujanishtha@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,summary);
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);


            }
        });
//UDEMI TUTORIALS

    }
}
