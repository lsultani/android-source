package io.bloc.android.blocly.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.ui.adapter.ItemAdapter;

/**
 * Created by lesliesultani on 12/29/14.
 */
public class BloclyActivity extends Activity {

    private ItemAdapter itemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(int) finds the layout file associated with the given resource
        // identifier and inflates it into a programmatic View which can be presented to the user.
        // res/ folder is dynamically assigned a unique, static number. This process is done every
        // time we build an application or whenever a new asset is created. R.layout.activity_blocly
        // refers to the unique number generated specifically for the activity_blocly.xml layout file.
        setContentView(R.layout.activity_blocly);

       // Toast.makeText(this,
       //         BloclyApplication.getSharedDataSource().getFeeds().get(0).getTitle(),
       //         Toast.LENGTH_LONG).show();

        itemAdapter = new ItemAdapter();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_activity_blocly);

        //A LayoutManager organizes ViewHolders and their respective Views within a RecyclerView.
        // We've chosen LinearLayoutManager due to the fact that it's already implemented and orders
        // items in a list much like the one we want.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // An ItemAnimator is responsible for animating each View within the RecyclerView as it is added or removed
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);

    }
}
