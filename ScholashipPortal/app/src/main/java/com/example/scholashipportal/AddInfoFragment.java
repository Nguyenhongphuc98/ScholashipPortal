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
public class AddInfoFragment extends Fragment {

    Button btnNext;


    public AddInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_info, container, false);

        btnNext=view.findViewById(R.id.btnNextToIntro);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransition=getFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.fragment_container,new AddIntroFragment());
                fragmentTransition.commit();
            }
        });

        return view;
    }

}
