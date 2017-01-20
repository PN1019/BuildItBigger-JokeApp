package com.example.abhi.builditbigger;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;

import com.example.abhi.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by abhi on 11/28/2016.
 */
@TargetApi(Build.VERSION_CODES.CUPCAKE)
public class EndpointsAsyncTask extends AsyncTask<Context,Void,String> {
    private static MyApi myApiService=null;
    private Context context;
    private TaskListener mlistener=null;

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService==null){
            MyApi.Builder builder=new MyApi.Builder(AndroidHttp.newCompatibleTransport(),new AndroidJsonFactory(),null)
                    .setRootUrl(BuildConfig.Url)//for preventing misuse of url "https://build-it-bigger-cc679.appspot.com/_ah/api/"
                    .setGoogleClientRequestInitializer
                            (new GoogleClientRequestInitializer() {
                                @Override
                                public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                                    abstractGoogleClientRequest.setDisableGZipContent(true);
                                }
                            });


            myApiService=builder.build();
        }
        context=params[0];
        try {
            return myApiService.getJokeFromLib().execute().getData();
        }
        catch (IOException e)
        {
            return e.getMessage();
        }


    }



    @Override
    protected void onPostExecute(String result){
        if(null!=mlistener)
            this.mlistener.getTaskResult(result);
    }



    public interface TaskListener{
        void getTaskResult(String result);
    }
    public EndpointsAsyncTask setListener(TaskListener listener) {
        this.mlistener = listener;
        return this;
    }
}