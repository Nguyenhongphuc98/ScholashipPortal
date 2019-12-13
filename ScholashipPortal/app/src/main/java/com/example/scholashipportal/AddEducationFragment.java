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
public class AddEducationFragment extends Fragment {

    Button btnNext;
    EditText from;
    EditText to;
    ImageView fromNext,fromPre,toNext,toPre;

    public AddEducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_education, container, false);
        btnNext=view.findViewById(R.id.btnnextToAward);

        from=view.findViewById(R.id.from2016);
        fromNext=view.findViewById(R.id.fromNext);
        fromPre=view.findViewById(R.id.fromPre);

        to=view.findViewById(R.id.to2018);
        toNext=view.findViewById(R.id.toNext);
        toPre=view.findViewById(R.id.toPre);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransition=getFragmentManager().beginTransaction();
                fragmentTransition.replace(R.id.fragment_container,new AddAwardFragment());
                fragmentTransition.commit();
            }
        });

        addEvent();
        return view;
    }

    void addEvent(){
        fromNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(from.getText().toString())+1;
                from.setText(String.valueOf(val));
            }
        });

        fromPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(from.getText().toString())-1;
                from.setText(String.valueOf(val));
            }
        });

        toNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(to.getText().toString())+1;
                to.setText(String.valueOf(val));
            }
        });

        toPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val=Integer.parseInt(to.getText().toString())-1;
                to.setText(String.valueOf(val));
            }
        });
    }

}
