package com.example.alumno.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;

/**
 * Created by alumno on 08/10/2015.
 */
public class HiloImagenes implements Runnable {

    private String link;
    private Handler handler;
    private int position;

    public HiloImagenes(String link, Handler handler, int position) {
        this.link = link;
        this.handler = handler;
        this.position = position;
    }

    @Override
    public void run() {
        HttpManager http =  new HttpManager(link);

        http =  new HttpManager(this.link);
        byte[] miArray = new byte[0];
        try {
            miArray = http.getBytesDataByGET();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bitmap bitmapImg = BitmapFactory.decodeByteArray(miArray, 0, miArray.length);

        Message msg= new Message();
        msg.arg1 = 1;
        msg.arg2 = this.position;
        msg.obj = bitmapImg;
        handler.sendMessage(msg);
    }
}
