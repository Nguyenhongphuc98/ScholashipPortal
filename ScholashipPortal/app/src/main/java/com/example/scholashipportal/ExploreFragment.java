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
public class ExploreFragment extends Fragment {

    Button btndoc1,btndoc2,btndoc3;
    ExploreDetailFragment mExploreDetail;

    private static ExploreFragment instance;
    public static ExploreFragment Instance(){
        if(instance == null)
            instance = new ExploreFragment();
        return instance;
    }

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_explore, container, false);

        btndoc1=view.findViewById(R.id.btnDocThem);
        btndoc2=view.findViewById(R.id.btnDocThem2);
        btndoc3=view.findViewById(R.id.btnDocThem3);

        mExploreDetail=new ExploreDetailFragment();

        addEvent();

        return view;
    }

    void addEvent(){
        btndoc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplaceFragment(mExploreDetail);
            }
        });

        btndoc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplaceFragment(mExploreDetail);
            }
        });

        btndoc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplaceFragment(mExploreDetail);
            }
        });
    }


    private void ReplaceFragment(Fragment fragment){
       GlobalSuport.ReplaceFragment(fragment
       );
    }

}
