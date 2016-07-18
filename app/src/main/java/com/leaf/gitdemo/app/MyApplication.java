package com.leaf.gitdemo.app;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.multidex.MultiDexApplication;
import android.util.DisplayMetrics;

import com.leaf.gitdemo.utils.SpUtil;

import java.util.Locale;

/**
 * Desc:
 * Data: 2016/7/18 11:25
 * Created by YJG
 */
public class MyApplication extends MultiDexApplication{

    @Override
    public void onCreate() {
        super.onCreate();
        Resources resources = getApplicationContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        config.locale = getSetLocale();
        resources.updateConfiguration(config, dm);
    }

    // 得到设置的语言信息
    private Locale getSetLocale() {
        // 读取储存的语言设置信息
        String locale = SpUtil.getInstance(this).getString("locale");
        return new Locale(locale);
    }


}
