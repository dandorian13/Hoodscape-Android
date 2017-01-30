package com.dandorian.spaceapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity
                            implements View.OnClickListener
{

    //image button
    private ImageButton buttonSettings;
    private ImageButton buttonNewGame;
    private ImageButton buttonCredits;
    private ImageButton buttonContinueStory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //getting the button
        buttonSettings = (ImageButton) findViewById(R.id.buttonSettings);
        buttonNewGame = (ImageButton) findViewById(R.id.buttonNewGame);
        buttonCredits = (ImageButton) findViewById(R.id.buttonCredits);
        buttonContinueStory = (ImageButton) findViewById(R.id.buttonContinueStory);

        //adding a click listener
        buttonNewGame.setOnClickListener(this);
    } //onCreate(Bundle)

    @Override
    public void onClick(View v)
    {
        //starting game activity
        startActivity(new Intent(this, FirstLevelActivity.class));
    } //onClick(View)

} //MainActivity class
