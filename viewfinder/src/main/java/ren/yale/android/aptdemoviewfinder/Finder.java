package ren.yale.android.aptdemoviewfinder;

import ren.yale.android.aptdemoviewfinder.provider.Provider;

/**
 * Created by Yale on 2017/6/27.
 */

public interface Finder<T> {

    void inject(T host,Object source,Provider provider);
}
