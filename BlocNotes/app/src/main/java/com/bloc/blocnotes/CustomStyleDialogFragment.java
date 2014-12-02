package com.bloc.blocnotes;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static com.bloc.blocnotes.R.*;


public class CustomStyleDialogFragment extends DialogFragment {

    public CustomStyleDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_custom_style_dialog, container, false);
        getDialog().setTitle("Customize");
        //needs to be spinner in layout
        Spinner spinner = (Spinner) rootView.findViewById(id.font_button);
        //getBaseContext is for activity so we use getActivity for fragment
        //createFromResource returns CharSequence
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.fonts_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        //add eventlistener, via position
        //look at observer pattern, set activity as listener to custom style dialog
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(parent.getContext(), "Font Selected : " +
                        parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

               /* switch (position) {
                    case 0:
                        Toast.makeText(parent.getContext(), "System Font", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(parent.getContext(), "Helvetica", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(parent.getContext(), "Helvetica-Neue", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(parent.getContext(), "Impact", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        return;
                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(parent.getContext(), "Select Font", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;

    }

}