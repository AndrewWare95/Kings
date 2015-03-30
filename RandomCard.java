package com.shanemcc94gmail.kings;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

public class RandomCard extends Activity {
    private ImageView appImageView;
    private Button appButton;
    private Drawable drawable;
    private Random random;
    private Drawable [] drawables = null;
    public int Kings =4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_card);



        appImageView = (ImageView) findViewById(R.id.imageView);
        appButton =(Button) findViewById(R.id.button);

        if(Kings == 0){
            Intent gameOverIntent = new Intent(this, GameOver.class);
            startActivity(gameOverIntent);
        }
        drawables = new Drawable[] {
                getResources().getDrawable(R.drawable.s1),
                getResources().getDrawable(R.drawable.s2),
                getResources().getDrawable(R.drawable.s3),
                getResources().getDrawable(R.drawable.s4),
                getResources().getDrawable(R.drawable.s5),
                getResources().getDrawable(R.drawable.s6),
                getResources().getDrawable(R.drawable.s7),
                getResources().getDrawable(R.drawable.s8),
                getResources().getDrawable(R.drawable.s9),
                getResources().getDrawable(R.drawable.s10),
                getResources().getDrawable(R.drawable.sj),
                getResources().getDrawable(R.drawable.sq),
                getResources().getDrawable(R.drawable.sk),

                getResources().getDrawable(R.drawable.c1),
                getResources().getDrawable(R.drawable.c2),
                getResources().getDrawable(R.drawable.c3),
                getResources().getDrawable(R.drawable.c4),
                getResources().getDrawable(R.drawable.c5),
                getResources().getDrawable(R.drawable.c6),
                getResources().getDrawable(R.drawable.c7),
                getResources().getDrawable(R.drawable.c8),
                getResources().getDrawable(R.drawable.c9),
                getResources().getDrawable(R.drawable.c10),
                getResources().getDrawable(R.drawable.cj),
                getResources().getDrawable(R.drawable.cq),
                getResources().getDrawable(R.drawable.ck),

                getResources().getDrawable(R.drawable.d1),
                getResources().getDrawable(R.drawable.d2),
                getResources().getDrawable(R.drawable.d3),
                getResources().getDrawable(R.drawable.d4),
                getResources().getDrawable(R.drawable.d5),
                getResources().getDrawable(R.drawable.d6),
                getResources().getDrawable(R.drawable.d7),
                getResources().getDrawable(R.drawable.d8),
                getResources().getDrawable(R.drawable.d9),
                getResources().getDrawable(R.drawable.d10),
                getResources().getDrawable(R.drawable.dj),
                getResources().getDrawable(R.drawable.dq),
                getResources().getDrawable(R.drawable.dk),

                getResources().getDrawable(R.drawable.h1),
                getResources().getDrawable(R.drawable.h2),
                getResources().getDrawable(R.drawable.h3),
                getResources().getDrawable(R.drawable.h4),
                getResources().getDrawable(R.drawable.h5),
                getResources().getDrawable(R.drawable.h6),
                getResources().getDrawable(R.drawable.h7),
                getResources().getDrawable(R.drawable.h8),
                getResources().getDrawable(R.drawable.h9),
                getResources().getDrawable(R.drawable.h10),
                getResources().getDrawable(R.drawable.hj),
                getResources().getDrawable(R.drawable.hq),
                getResources().getDrawable(R.drawable.hk)
        };


        if(Kings == 0){
            Intent gameOverIntent = new Intent(this, GameOver.class);
            startActivity(gameOverIntent);
        }
        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                random = new Random();
                int randomNumber = random.nextInt(drawables.length);
                drawable = drawables[randomNumber];

                appImageView.setImageDrawable(drawable); // set the image to the ImageView
                if((drawables[randomNumber] == drawables[12])||(drawables[randomNumber] == drawables[25])||(drawables[randomNumber] == drawables[38])||(drawables[randomNumber] == drawables[51])){
                    Kings = Kings-1;
                }

                if((drawables[randomNumber] == drawables[0])||(drawables[randomNumber] == drawables[13])||(drawables[randomNumber] == drawables[26])||(drawables[randomNumber] == drawables[39])){
                    TextView textElement01 = (TextView)findViewById(R.id.rulesText);
                    textElement01.setText("Ace-Face");
                }

                TextView textElement = (TextView)findViewById(R.id.textView2);

                textElement.setText("Kings Remaining: " + Kings);

                if(Kings == 0){
                    startActivity(new Intent(RandomCard.this, GameOver.class));
                }



            }
        });

        Button quitButton = (Button) findViewById(R.id.quitGame);
        quitButton.setOnClickListener
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        System.exit(0);
                    }
                });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_random_card, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
