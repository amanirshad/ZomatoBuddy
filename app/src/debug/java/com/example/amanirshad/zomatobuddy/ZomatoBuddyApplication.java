package com.example.amanirshad.zomatobuddy;

import android.app.Application;

import com.example.amanirshad.zomatobuddy.common.Analytics;
import com.example.amanirshad.zomatobuddy.database.CacheDB;
import com.squareup.leakcanary.LeakCanary;

import io.realm.Realm;
import timber.log.Timber;

public class ZomatoBuddyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);

        //Init the CacheDB
        CacheDB.init(this);

        //Init analytics
        Analytics.init(this);

        //Realm init
        Realm.init(this);

        //Init debug version of Timber tree
        Timber.plant(new BuddyDebugTree());
    }
}
