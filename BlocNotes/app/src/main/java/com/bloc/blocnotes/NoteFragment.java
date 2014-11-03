package com.bloc.blocnotes;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by lesliesultani on 10/28/14.
 */
public class NoteFragment extends Fragment {

    public NoteFragment() {
        // Emptiness
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button button = new Button(getActivity());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50, 30);
        relativeLayout.addView(button, params);
        //View rootView = inflater.inflate(R.layout.notefragment, container, false);
        //return rootView;
    }

}
