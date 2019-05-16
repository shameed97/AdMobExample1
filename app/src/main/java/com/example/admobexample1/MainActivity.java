package com.example.admobexample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Log.d("AdMob", "AdMob Loaded");
            }

            @Override
            public void onAdOpened() {
                Log.d("AdMob", "AdMob Opened");
            }

            @Override
            public void onAdClicked() {
                Log.d("AdMob", "AdMob Clicked");
            }

            @Override
            public void onAdClosed() {
                Log.d("AdMob", "AdMob Closed");
            }

            @Override
            public void onAdFailedToLoad(int i) {
                Log.d("AdMob", "AdMob Failed To Load");
            }

            @Override
            public void onAdLeftApplication() {
                Log.d("AdMob", "User Left From the App");
            }
        });
    }

}
