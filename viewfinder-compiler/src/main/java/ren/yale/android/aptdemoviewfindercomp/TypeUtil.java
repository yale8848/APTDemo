package ren.yale.android.aptdemoviewfindercomp;

import com.squareup.javapoet.ClassName;

/**
 * Created by Yale on 2017/6/27.
 */

public class TypeUtil {
    public static final ClassName ANDROID_VIEW = ClassName.get("android.view", "View");
    public static final ClassName ANDROID_ON_CLICK_LISTENER = ClassName.get("android.view", "View", "OnClickListener");
    public static final ClassName FINDER = ClassName.get("ren.yale.android.aptdemoviewfinder", "Finder");
    public static final ClassName PROVIDER = ClassName.get("ren.yale.android.aptdemoviewfinder.provider", "Provider");
}
