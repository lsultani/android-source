package com.bloc.blocnotes;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/**
 * Created by lesliesultani on 10/28/14.
 */
public class NoteFragment extends Fragment {

    private EditText editText;

    public NoteFragment() {
        // Emptiness
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /* Button button = new Button(getActivity());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(50, 30);
        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        relativeLayout.addView(button, params);
        return relativeLayout; */
        View rootView = inflater.inflate(R.layout.notefragment, container, false);

        //gt the editText item
        editText = (EditText) rootView.findViewById(R.id.noteText);

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            String e = savedInstanceState.getString("mytext");
            //set the string in the editText item
            editText.setText(e);
        }

        return rootView;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mytext", editText.getText().toString());
    }


}
