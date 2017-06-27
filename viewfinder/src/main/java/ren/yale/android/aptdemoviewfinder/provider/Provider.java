package ren.yale.android.aptdemoviewfinder.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by Yale on 2017/6/27.
 */

public interface Provider {
    Context getContext(Object source);
    View findView(Object source, int id);
}
