package com.example.sampleworkmanager;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SampleWorkManager extends Worker {
    private static final String TAG = "SampleWorkManager";
    //constructor
    public SampleWorkManager(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d(TAG, "doWork: started");

        Data inputdata  = getInputData();

        String name = inputdata.getString("name");
        Log.d(TAG, "doWork: name" + name);

        int number   =  inputdata.getInt("number", 0);

        for(int i = 0 ; i <= 0 ; i++)
        {
            Log.d(TAG, "doWork: our number is " +number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return Result.success();
    }
}
