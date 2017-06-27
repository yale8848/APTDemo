package ren.yale.android.aptdemoviewfinder.provider;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/**
 * Created by Yale on 2017/6/27.
 */

public class ActivityProvider implements Provider {
    @Override
    public Context getContext(Object source) {
        return ((Activity) source);
    }

    @Override
    public View findView(Object source, int id) {
        return ((Activity) source).findViewById(id);
    }
}
