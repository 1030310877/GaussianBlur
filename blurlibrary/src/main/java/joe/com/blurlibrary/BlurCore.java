package joe.com.blurlibrary;

import android.graphics.Bitmap;

/**
 * Description
 * Created by chenqiao on 2016/4/8.
 */
public class BlurCore {

    public static native int blurBitmap(Bitmap bitmap, int radius);

    static {
        System.loadLibrary("blurcore");
    }
}
