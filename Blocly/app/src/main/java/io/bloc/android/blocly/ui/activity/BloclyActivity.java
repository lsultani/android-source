package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;

/**
 * Created by lesliesultani on 12/29/14.
 */
public class BloclyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(int) finds the layout file associated with the given resource
        // identifier and inflates it into a programmatic View which can be presented to the user.
        // res/ folder is dynamically assigned a unique, static number. This process is done every
        // time we build an application or whenever a new asset is created. R.layout.activity_blocly
        // refers to the unique number generated specifically for the activity_blocly.xml layout file.
        setContentView(R.layout.activity_blocly);
        Toast.makeText(this,
                BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
                Toast.LENGTH_LONG).show();
    }
}
