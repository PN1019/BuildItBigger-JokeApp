package com.example.abhi.android_jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abhi on 12/1/2016.
 */
public class JokesDisplayActivity extends AppCompatActivity {
  private TextView tv_JokesDisplay;
//    String Joke;
//    Button back;
//    String product;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        tv_JokesDisplay= (TextView) findViewById(R.id.tvjoke_display);
        String joke=getIntent().getStringExtra(Intent.EXTRA_TEXT);
//        if(savedInstanceState==null){
//            Bundle extras=getIntent().getExtras();
//            if(extras==null)
//            {Joke=null;
//                product="free";
//            }else {
//                Joke=extras.getString("Joke");
//                product=extras.getString("Product");
//
//            }
//        }
//        else {
//            Joke=(String)savedInstanceState.getSerializable("Joke");
//        product=(String)savedInstanceState.getSerializable("Product");
//        }

        tv_JokesDisplay.setText(joke);
//        back= (Button) findViewById(R.id.btn_back);
//    back.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            finish();
//        }
//    });

    }

}
