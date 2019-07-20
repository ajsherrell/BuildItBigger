package com.udaciy.gradle.builditbigger.free;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import com.udacity.gradle.builditbigger.R;


public class MainActivityFragment extends AppCompatActivity {

    public MainActivityFragment() {
    }

    private InterstitialAd mInterstitial;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main_fragment, container, false);

        MobileAds.initialize(getActivity().getApplicationContext(), getString(R.string.ad_app_id));

        mInterstitial = new InterstitialAd(getActivity().getApplicationContext());
        mInterstitial.setAdUnitId(R.string.interstitial_ad_unit_id);
        mInterstitial.loadAd(new AdRequest.Builder().build());
        // TODO: connect interstitialAd to root
        AdView mAdView = (AdView) root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);
        return root;
    }
}
