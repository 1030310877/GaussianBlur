package joe.com.gaussianblur;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import joe.com.blurlibrary.BlurCore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.img);
        Bitmap bp = BitmapFactory.decodeResource(getResources(), R.drawable.bp);
        BlurCore.blurBitmap(bp, 40);
        img.setImageBitmap(bp);
    }
}
