package com.leaf.gitdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leaf.gitdemo.ui.DiffrendTextActivity;
import com.leaf.gitdemo.utils.SpUtil;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        String languageToLoad = "gg"; // your language
//        Locale locale = new Locale(languageToLoad);
//        Locale.setDefault(locale);
//        Configuration config = new Configuration();
//        config.locale = locale;
//        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        setContentView(R.layout.activity_main);


    }



    /**
     * 设置默认的文本value/string.xml
     * @param view
     */
    public void buttonClick(View view) {
        String languageToLoad = ""; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("对话框").setMessage(getString(R.string.app_name)).setNegativeButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SpUtil.getInstance(getApplicationContext()).putString("locale","");
                dialog.dismiss();
                restartApp();
            }
        }).create().show();
    }

    /**
     * 设置自定义的文本value-gg/string.xml
     *
     * @param view
     */
    public void buttonClickFood(View view) {
        String languageToLoad = "gg"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("对话框").setMessage(getString(R.string.app_name)).setNegativeButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SpUtil.getInstance(getApplicationContext()).putString("locale","gg");
                dialog.dismiss();
                restartApp();
            }
        }).create().show();
    }

    /**
     * 设置预设配置的文本(英文) value-en/string.xml
     *
     * @param view
     */
    public void buttonClickEn(View view) {
        String languageToLoad = "en"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("对话框").setMessage(getString(R.string.app_name)).setNegativeButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SpUtil.getInstance(getApplicationContext()).putString("locale","en");
                dialog.dismiss();
                restartApp();
            }
        }).create().show();
    }

    public void restartApp(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }




    public void buttonClickTurn(View view){
        Intent intent = new Intent(this, DiffrendTextActivity.class);
        startActivity(intent);
    }

}
