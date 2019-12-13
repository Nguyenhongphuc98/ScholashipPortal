package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddIntroFragment extends Fragment {

    Button btnDone;


    public AddIntroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_intro, container, false);

        btnDone=view.findViewById(R.id.hoanthanh);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransition=getFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.fragment_container,new InforFragment());
                fragmentTransition.commit();
            }
        });

        return  view;
    }

}
