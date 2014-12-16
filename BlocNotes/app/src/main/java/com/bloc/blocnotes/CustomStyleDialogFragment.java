package com.bloc.blocnotes;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import static com.bloc.blocnotes.R.*;


public class CustomStyleDialogFragment extends DialogFragment {
    private CustomStylesObserver listener = null;
    public Button closeDialogButton;

    public CustomStyleDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_custom_style_dialog, container, false);
        getDialog().setTitle("Change Font:");
        //needs to be spinner in layout
        Spinner spinner = (Spinner) rootView.findViewById(id.font_button);
        //getBaseContext is for activity so we use getActivity for fragment
        //createFromResource returns CharSequence
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.fonts_array, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        /*closeDialogButton = (Button) getDialog().findViewById(id.closeDialogButton);
        closeDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        //add eventlistener, via position
        //look at observer pattern, set activity as listener to custom style dialog
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

             // Toast toast = Toast.makeText(parent.getContext(), "Font Selected : " +
             // parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

             //OBSERVER PATTERN - passing information to listener

                String selectFont;
                selectFont = "fonts/" + parent.getItemAtPosition(position).toString() + ".ttf";
                sendFontChange(selectFont);

                /*switch (position) {
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
                } */
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Nothing
            }
        });

        return rootView;

    }

    public void closeDialog(View v) {
        Toast.makeText(getActivity(), "Close Dialog", Toast.LENGTH_SHORT).show();
    }

    public void listenFontChange(CustomStylesObserver listener) {
        this.listener = listener;
    }

    public void sendFontChange(String selectFont) {
        if(this.listener != null){
            listener.setFontType(selectFont);
        }
    }

}