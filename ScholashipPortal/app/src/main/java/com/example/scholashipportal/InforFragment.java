package com.example.scholashipportal;


import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.scholashipportal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InforFragment extends Fragment {

    ImageView eduExpan;
    ImageView award;
    ImageView info;
    ImageView intro;

    ConstraintLayout eduLayout;
    ConstraintLayout awardLayout;
    ConstraintLayout infoLayout;
    ConstraintLayout introLayout;


    public InforFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_infor, container, false);
        eduExpan=view.findViewById(R.id.edu_expan_icon);
        award=view.findViewById(R.id.award_expan_icon);
        info=view.findViewById(R.id.infoexpanicon);
        intro=view.findViewById(R.id.intro_expan_icon);

        eduLayout=view.findViewById(R.id.education);
        awardLayout=view.findViewById(R.id.award);
        infoLayout=view.findViewById(R.id.info);
        introLayout=view.findViewById(R.id.intro);

        setEvent();

        return view;
    }

    void setEvent(){
        eduExpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eduLayout.setMaxHeight(60);
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });

        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awardLayout.setMaxHeight(60);
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoLayout.setMaxHeight(60);
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                introLayout.setMaxHeight(60);
                Toast.makeText(getContext(),"clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
