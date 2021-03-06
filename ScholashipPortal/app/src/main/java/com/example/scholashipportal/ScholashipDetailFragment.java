package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScholashipDetailFragment extends Fragment {
    ImageView ivBack;
    Button btnApply;
    Button btnSave;
    RelativeLayout companyArea;


    public ScholashipDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_scholaship_detail, container, false);
        ivBack = view.findViewById(R.id.scholashipdetail_back);
        btnApply = view.findViewById(R.id.btnApply);
        btnSave = view.findViewById(R.id.btnSave);
        companyArea = view.findViewById(R.id.companyArea);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GlobalSuport.preIsFavoriteList)
                    GlobalSuport.ReplaceFragment(new FavoriteFragment());
                else
                    GlobalSuport.ReplaceFragment(HomeFragment.Instance());
            }
        });

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnApply.setEnabled(false);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSave.setEnabled(false);
            }
        });

        companyArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new CompaniInfoFragment());
            }
        });
        return view;
    }

}
