package ren.yale.android.aptdemoviewfinder.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by Yale on 2017/6/27.
 */

public class ViewProvider implements Provider {
    @Override
    public Context getContext(Object source) {
        return ((View)source).getContext();
    }

    @Override
    public View findView(Object source, int id) {
        return ((View)source).findViewById(id);
    }
}
