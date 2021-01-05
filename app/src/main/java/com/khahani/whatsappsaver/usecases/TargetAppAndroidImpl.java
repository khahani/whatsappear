package com.khahani.whatsappsaver.usecases;

import android.content.Context;
import android.content.pm.PackageManager;

public class TargetAppAndroidImpl extends TargetApp {

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public boolean installed(String appId) {
        PackageManager pm = context.getPackageManager();
        try {
            pm.getPackageInfo(appId, PackageManager.GET_ACTIVITIES);
            return INSTALLED;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            throw new AppNotExists();
        }
    }

}
