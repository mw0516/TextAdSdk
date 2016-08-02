package com.example.admin.textadsdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.coold.aggregates.UnionSplashAd;
import com.coold.splash.SplashListener;

/**
 * Created by mw on 2016/5/17.
 * 进入新闻界面的splash
 */
public class SplashNewsActivity extends Activity {

    private LinearLayout adsParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        adsParent = (LinearLayout) findViewById(R.id.adsRl);
        xlSplash(adsParent);
    }

    /**
     * 星联开屏
     *
     * @param adsParent
     */
    private void xlSplash(LinearLayout adsParent) {
        UnionSplashAd splashAd = new UnionSplashAd(this, adsParent, utils.devKey, utils.appKey, utils.devSecKey, utils.secKey);
        splashAd.setSplashListener(new SplashListener() {

            @Override
            public void onComplete() {
                //开屏广告加载完
                Log.i("xlsplash", "onComplete");
                jumpWhenCanClick();
            }

            @Override
            public void onFailed(String s) {
                //失败后一些处理
                Log.i("xlsplash", "onFailed");
                jumpWhenCanClick();
            }
        });
        Log.i("xlsplash", "xlsplash-splashnews");
    }

    private void jumpWhenCanClick() {
        Intent intent = new Intent(SplashNewsActivity.this, InsertActivity.class);
        this.startActivity(intent);
        this.finish();
    }


}
