package com.example.admin.textadsdk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.coold.aggregates.UnionInsertAd;

public class InsertActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initXLInsert();
    }

    private void initXLInsert() {
        UnionInsertAd insertAd = new UnionInsertAd(this, utils.devKey, utils.appKey, utils.devSecKey, utils.secKey);
        insertAd.showAd();
        Log.i("xlinsert", "xlinsert-news");
    }
}
