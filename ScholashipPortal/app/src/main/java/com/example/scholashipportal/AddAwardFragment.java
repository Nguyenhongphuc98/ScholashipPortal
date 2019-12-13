package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddAwardFragment extends Fragment {

    Button btnNext;

    ImageView nextYear,preYear;
    EditText year;


    public AddAwardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_award, container, false);

        btnNext=view.findViewById(R.id.btnnextToInfo);
        nextYear=view.findViewById(R.id.yearNext);
        preYear=view.findViewById(R.id.yearPre);
        year=view.findViewById(R.id.year2016);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransition=getFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.fragment_container,new AddInfoFragment());
                fragmentTransition.commit();
            }
        });

        nextYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(year.getText().toString())+1;
                year.setText(String.valueOf(val));
            }
        });

        preYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(year.getText().toString())-1;
                year.setText(String.valueOf(val));
            }
        });

        return  view;
    }

}
