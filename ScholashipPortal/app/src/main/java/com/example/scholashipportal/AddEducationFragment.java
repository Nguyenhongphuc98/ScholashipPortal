package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddEducationFragment extends Fragment {

    Button btnNext;
    EditText from;
    EditText to;
    ImageView fromNext,fromPre,toNext,toPre, back;

    EditText tenToChucDaoTao;
    EditText gpa;

    int countEdu=0;
    Button plusEducation;
    Button countEducation;

    List<String> heDaoTaoArr;
    Spinner spinner;

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
        back=view.findViewById(R.id.backtoProfile);

        to=view.findViewById(R.id.to2018);
        toNext=view.findViewById(R.id.toNext);
        toPre=view.findViewById(R.id.toPre);

        plusEducation=view.findViewById(R.id.plusEducation);
        countEducation=view.findViewById(R.id.countEducation);

        tenToChucDaoTao=view.findViewById(R.id.tentochucdaotao);
        gpa=view.findViewById(R.id.gpa);

        heDaoTaoArr= new ArrayList<>();
        heDaoTaoArr.add("Chọn hệ đào tạo");
        heDaoTaoArr.add("Chính quy");
        heDaoTaoArr.add("Bổ túc");
        heDaoTaoArr.add("Cao đẳng liên thông");
        heDaoTaoArr.add("Đào tạo tại chức");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item,heDaoTaoArr);
        spinner=view.findViewById(R.id.spinerHeDaoTao);
        spinner.setAdapter(adapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new AddAwardFragment());
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

        plusEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countEdu++;
                countEducation.setText(countEdu+"");
                tenToChucDaoTao.setText("");
                gpa.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new InforFragment());
            }
        });
    }

}
