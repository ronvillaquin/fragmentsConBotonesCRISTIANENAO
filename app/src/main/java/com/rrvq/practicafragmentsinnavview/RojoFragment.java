package com.rrvq.practicafragmentsinnavview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RojoFragment extends Fragment {

    View view;
    private TextView tvTexto;
    private  int count = 0;


    public RojoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_rojo, container, false);

        casting();

        count++;
        String en = "Entrada a la vista: " + count;
        tvTexto.setText(en);


        return view;
    }

    private void casting(){
        tvTexto = view.findViewById(R.id.tvtexto);
    }

}