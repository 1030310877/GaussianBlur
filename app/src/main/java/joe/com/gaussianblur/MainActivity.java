package joe.com.gaussianblur;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import joe.com.blurlibrary.BlurCore;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        new Thread(new Runnable() {
            @Override
            public void run() {
                final Bitmap bp = BitmapFactory.decodeResource(getResources(), R.drawable.bp);
                BlurCore.blurBitmap(bp, 40);
                img.post(new Runnable() {
                    @Override
                    public void run() {
                        img.setImageBitmap(bp);
                    }
                });
            }
        }).start();

    }
}
