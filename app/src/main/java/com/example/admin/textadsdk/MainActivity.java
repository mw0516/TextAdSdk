package com.example.admin.textadsdk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.coold.BannerLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.adbanner);
        //String chkey,String appkey,String ch_secret_key,String app_secret_key
        BannerLayout bannerLayout = new BannerLayout(this,"qPc43hJaP9rUdE2b","t3m5aMr2q0Of6f1936bbcolCshkSt96f","BPOZE3LMcmJkIqQZBjk9kKQEmV92gEqF","03r5dzT8viC56f1r36c2BZ2gae5zj969");
        layout.addView(bannerLayout);
    }
}
