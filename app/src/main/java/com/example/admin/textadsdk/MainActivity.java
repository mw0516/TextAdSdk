package com.example.admin.textadsdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.coold.aggregates.UnionBanner;

public class MainActivity extends Activity implements View.OnClickListener {
    private LinearLayout adbanner;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adbanner = (LinearLayout) findViewById(R.id.adbanner);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        new UnionBanner(this, utils.devKey, utils.appKey, utils.devSecKey, utils.secKey, adbanner);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, SplashNewsActivity.class));
    }
}
