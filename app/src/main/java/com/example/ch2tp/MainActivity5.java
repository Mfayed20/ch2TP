package com.example.ch2tp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    int playing;
    MediaPlayer mp1,mp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

//        mp1 = new MediaPlayer();
        mp1 = MediaPlayer.create(MainActivity5.this,R.raw.track2);

//        mp2 = new MediaPlayer();
        mp2 = MediaPlayer.create(MainActivity5.this,R.raw.track3);


        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp2.isPlaying())
                    button5.callOnClick();

                switch (playing) {
                    case 0:
                        mp1.start();
                        playing++;
                        break;
                    case 1:
                        mp1.pause();
                        playing--;
                        break;
                }
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp1.isPlaying())
                    button4.callOnClick();


                switch (playing){
                    case 0:
                        mp2.start();
                        playing++;
                        break;
                    case 1:
                        mp2.pause();
                        playing--;
                        break;
                }
            }
    });
};
}