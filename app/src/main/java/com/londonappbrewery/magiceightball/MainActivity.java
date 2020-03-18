package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final ImageView ballImage = (ImageView) findViewById(R.id.imagee);

        final int[] ballsArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNum = new Random();

                int num = randomNum.nextInt(5);

            Log.d("Kugla", "Kugla br: " + num);
            ballImage.setImageResource(ballsArray[num]);
            }
        });
    }
}
