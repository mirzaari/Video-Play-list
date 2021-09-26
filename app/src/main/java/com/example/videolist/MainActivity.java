package com.example.videolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout song1, song2, song3,song4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        song1 = findViewById(R.id.song1);
        song2 = findViewById(R.id.song2);
        song3 = findViewById(R.id.song3);
        song4 = findViewById(R.id.song4);
        

        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoplayer.video_url ="https://www.youtube.com/embed/PG53NSAYuMg";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);


            }
        });
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoplayer.video_url ="https://www.youtube.com/embed/qzjutBcGkBc";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);


            }
        });
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoplayer.video_url ="https://www.youtube.com/embed/lBTW4oE0D10";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);


            }
        });

        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoplayer.video_url ="https://www.youtube.com/embed/lBTW4oE0D10";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);


            }
        });



    }
}