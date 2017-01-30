package com.dandorian.spaceapp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.content.Context;

/**
 * Created by Dan Dorian on 26/01/2017.
 */

public class GameView extends SurfaceView
{
    /*volatile boolean playing; //check if the game is being played

    private Thread gameThread = null;
    */
    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder surfaceHolder;

    public GameView(Context context)
    {
        super(context);
        surfaceHolder = getHolder();
        paint = new Paint();
    } //GameView(Context) - Constructor

    /*@Override
    public void run()
    {
        while(playing)
        {
            update();
            draw();
            control();
        } //while()
    } //run() - Override

    private void update() {}
    private void draw() {}
    private void control()
    {
        try
        {gameThread.sleep(17);} //try
        catch (InterruptedException e)
        {e.printStackTrace();} //catch
    } //control()
    */
} //GameView class
