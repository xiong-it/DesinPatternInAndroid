package michaelx.tech.desinpatterninandroid.factory_method;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.DrawableRes;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

/**
 * Created by xiongxunxiang on 2017/5/10.
 */

public class UilClient implements ImageLoaderInterf {
    private static final String TAG = UilClient.class.getSimpleName();
    private static UilClient sInstance;

    private UilClient() {}

    public static UilClient getInstance() {
        synchronized (UilClient.class) {
            if (sInstance == null) {
                sInstance = new UilClient();
            }
        }
        return sInstance;
    }

    @Override
    public void load(Context context, String imgUrl, View view) {
        try {
            ImageLoader.getInstance().displayImage(imgUrl, (ImageView) view);
        } catch (ClassCastException e) {
            e.printStackTrace();
            Log.e(TAG, "universal Image Loader can not load bitmap into other view except ImageView.");
        }
    }

    @Override
    public void load(Context context, String imgUrl, View view, final CallBack c) {
        try {
            ImageLoader.getInstance().displayImage(imgUrl, (ImageView) view, new SimpleImageLoadingListener() {
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    if (c != null) {
                        c.onFailure();;
                    }
                }

                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    if (c != null) {
                        c.onSuccess(loadedImage);
                    }
                }
            });
        } catch (ClassCastException e) {
            e.printStackTrace();
            Log.e(TAG, "universal Image Loader can not load bitmap into other view except ImageView.");
        }
    }

    @Override
    public void load(Context context, String imgUrl, @DrawableRes int errDrawable, View view) {

    }

    @Override
    public void load(Context context, String imgUrl, @DrawableRes int errDrawable, View view, final CallBack c) {
        try {
            ImageLoader.getInstance().displayImage(imgUrl, (ImageView) view, new SimpleImageLoadingListener() {
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    if (c != null) {
                        c.onFailure();;
                    }
                }

                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    if (c != null) {
                        c.onSuccess(loadedImage);
                    }
                }
            });
        } catch (ClassCastException e) {
            e.printStackTrace();
            Log.e(TAG, "universal Image Loader can not load bitmap into other view except ImageView.");
        }
    }

    @Override
    public void loadRound(Context context, String imgUrl, View view) {

    }

    @Override
    public void loadRound(Context context, String imgUrl, View view, final CallBack c) {
        try {
            ImageLoader.getInstance().displayImage(imgUrl, (ImageView) view, new SimpleImageLoadingListener() {
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    if (c != null) {
                        c.onFailure();;
                    }
                }

                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    if (c != null) {
                        c.onSuccess(loadedImage);
                    }
                }
            });
        } catch (ClassCastException e) {
            e.printStackTrace();
            Log.e(TAG, "universal Image Loader can not load bitmap into other view except ImageView.");
        }
    }

    @Override
    public void loadRound(Context context, String imgUrl, @DrawableRes int errDrawable, View view) {

    }

    @Override
    public void loadRound(Context context, String imgUrl, @DrawableRes int errDrawable, View view, final CallBack c) {
        try {
            ImageLoader.getInstance().displayImage(imgUrl, (ImageView) view, new SimpleImageLoadingListener() {
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    if (c != null) {
                        c.onFailure();;
                    }
                }

                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    if (c != null) {
                        c.onSuccess(loadedImage);
                    }
                }
            });
        } catch (ClassCastException e) {
            e.printStackTrace();
            Log.e(TAG, "universal Image Loader can not load bitmap into other view except ImageView.");
        }
    }
}
