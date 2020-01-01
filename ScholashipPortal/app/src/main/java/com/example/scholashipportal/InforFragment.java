package com.example.scholashipportal;


import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    Button btnEditProfile;


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

        btnEditProfile = view.findViewById(R.id.btnSuaHoSo);

        setEvent();

        return view;
    }

    void setEvent(){
        eduExpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams layout = eduLayout.getLayoutParams();
                if(eduLayout.getHeight() > 60){
                    layout.height = 60;
                    eduLayout.setLayoutParams(layout);
                    eduExpan.setImageResource(R.drawable.icon_down_green);
                }else{
                    layout.height = 297;
                    eduLayout.setLayoutParams(layout);
                    eduExpan.setImageResource(R.drawable.icon_up);
                }
            }
        });

        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams layout = awardLayout.getLayoutParams();
                if(awardLayout.getHeight() >60){
                    layout.height = 60;
                    awardLayout.setLayoutParams(layout);
                    award.setImageResource(R.drawable.icon_down_green);
                }else {
                    layout.height = 345;
                    awardLayout.setLayoutParams(layout);
                    award.setImageResource(R.drawable.icon_up);
                }
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams layout = infoLayout.getLayoutParams();
                if(infoLayout.getHeight() >60) {
                    layout.height = 60;
                    infoLayout.setLayoutParams(layout);
                    info.setImageResource(R.drawable.icon_down_green);
                } else {
                    layout.height = 360;
                    infoLayout.setLayoutParams(layout);
                    info.setImageResource(R.drawable.icon_up);
                }
            }
        });

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams layout = introLayout.getLayoutParams();
                if(introLayout.getHeight() >60){
                    layout.height = 60;
                    introLayout.setLayoutParams(layout);
                    intro.setImageResource(R.drawable.icon_down_green);
                } else {
                    layout.height = 265;
                    introLayout.setLayoutParams(layout);
                    intro.setImageResource(R.drawable.icon_up);
                }
            }
        });

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new AddEducationFragment());
            }
        });
    }

}
