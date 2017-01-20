package com.example.abhi.builditbigger;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import com.example.abhi.builditbigger.EndpointsAsyncTask;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.ExecutionException;

/**
 * Created by abhi on 12/1/2016.
 */
@RunWith(JUnit4.class)
@SmallTest
public class BackendTest extends AndroidTestCase {
    private String joke;
    public void testBackend()throws ExecutionException,InterruptedException{
        EndpointsAsyncTask task=new EndpointsAsyncTask();
        task.setListener(new EndpointsAsyncTask.TaskListener() {
            @Override
            public void getTaskResult(String result) {
                joke=result;
            }
        }).execute(mContext).get();
        assertTrue(joke,joke.length()>0);
        }
    }
