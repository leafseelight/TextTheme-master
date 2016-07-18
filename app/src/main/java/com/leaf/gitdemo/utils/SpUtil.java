package com.leaf.gitdemo.utils;


import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by Terry.Chen on 2015/6/29 16:32.
 * Description:
 * Email:cxm_lmz@163.com
 */
public class SpUtil {
    private final String SHAREPREFENCE_NAME = "share-pre";
    private SharedPreferences mSharedPrefrence;
    private SharedPreferences.Editor mEditor;
    private static SpUtil mSputil = null;

    private SpUtil(Context context) {
        mSharedPrefrence = context.getSharedPreferences(SHAREPREFENCE_NAME, Context.MODE_PRIVATE);
        mEditor = mSharedPrefrence.edit();
    }

    public static SpUtil getInstance(Context context) {
        if (mSputil == null) {
            synchronized (SpUtil.class) {
                if (mSputil == null) {
                    mSputil = new SpUtil(context);
                }
            }
        }
        return mSputil;
    }

    public void putString(String name, String str) {
        mEditor.putString(name, str).commit();
    }

    public String getString(String name) {
        return mSharedPrefrence.getString(name, "");
    }

}
