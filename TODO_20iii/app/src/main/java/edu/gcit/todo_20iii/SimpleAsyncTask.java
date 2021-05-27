package edu.gcit.todo_20iii;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class SimpleAsyncTask extends AsyncTask <Void, Void, String>{
    public WeakReference<TextView> mTextView;

    SimpleAsyncTask (TextView mTextView ) {
        mTextView = new WeakReference<>(tv)
    }
    @Override
    protected String doInBackground(Void... voids) {
        return null;
    }
}
