package com.example.abhi.builditbigger;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.abhi.android_jokelibrary.JokesDisplayActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by abhi on 12/3/2016.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private ProgressBar mprogressBar;
    private InterstitialAd mInterstitialAd;
    private String mJoke;
    private Button btn_joke1;
    public MainActivityFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        btn_joke1 = (Button) root.findViewById(R.id.btn_joke);
        btn_joke1.setOnClickListener(this);
        mprogressBar = (ProgressBar) root.findViewById(R.id.progressBar);
        mprogressBar.setVisibility(View.GONE);

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        AdView mAdView = (AdView) root.findViewById(R.id.adView);

        mAdView.loadAd(adRequest);
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                loadInterstitialAd();
                startJokeActivity(mJoke);
            }
        });
        loadInterstitialAd();
        return root;
    }


    private void loadInterstitialAd(){
        final AdRequest adRequest=new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mInterstitialAd.loadAd(adRequest);
    }
    private void startJokeActivity(String result){
        Intent intent=new Intent(getActivity(), JokesDisplayActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT,result);
        startActivity(intent);
    }
//    private void showInterstitialAd(){//if Ads are loaded ,show Interstitial else show nothing ..
//        if(mInterstitialAd.isLoaded()){
//            mInterstitialAd.show();
//        }
//    }
    public void tellAJoke(View view){
        if (!mInterstitialAd.isLoaded()&&mInterstitialAd.isLoading())
            loadInterstitialAd();
        mprogressBar.setVisibility(View.VISIBLE);
        Toast.makeText(getActivity(),R.string.waiting_for_joke,Toast.LENGTH_SHORT).show();

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setListener(new com.example.abhi.builditbigger.EndpointsAsyncTask.TaskListener(){
            @Override
            public void getTaskResult(String result) {
                mprogressBar.setVisibility(View.GONE);
                mJoke=result;
                if(mInterstitialAd.isLoaded())//if Ads are loaded ,show Interstitial else start Joke Activity .
                    mInterstitialAd.show();
                    else
                    startJokeActivity(result);
            }
        }).execute(getActivity());

     }
    @Override
    public void onClick(View v) {
     tellAJoke(v);
    }
}
