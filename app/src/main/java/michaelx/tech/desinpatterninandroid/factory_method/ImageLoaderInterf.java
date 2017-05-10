package michaelx.tech.desinpatterninandroid.factory_method;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.DrawableRes;
import android.view.View;

/**
 * Created by xiongxunxiang on 2017/5/10.
 */

public interface ImageLoaderInterf {
    interface CallBack {
        void onSuccess(Bitmap result);
        void onFailure();
    }

    void load(Context context, String imgUrl, View view);
    void load(Context context, String imgUrl, View view, CallBack c);
    void load(Context context, String imgUrl, @DrawableRes int errDrawable, View view);
    void load(Context context, String imgUrl, @DrawableRes int errDrawable, View view, CallBack c);

    void loadRound(Context context, String imgUrl, View view);
    void loadRound(Context context, String imgUrl, View view, CallBack c);
    void loadRound(Context context, String imgUrl, @DrawableRes int errDrawable, View view);
    void loadRound(Context context, String imgUrl, @DrawableRes int errDrawable, View view, CallBack c);
}
