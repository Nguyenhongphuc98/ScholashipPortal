package com.example.scholashipportal;


import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddInfoFragment extends Fragment {

    Button btnNext;

    ImageView next,pre;
    EditText gioitinh;
    EditText ngaySinh;

    Calendar dateSelected = Calendar.getInstance();
    private DatePickerDialog datePickerDialog;

    public AddInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_info, container, false);

        btnNext=view.findViewById(R.id.btnNextToIntro);
        next=view.findViewById(R.id.nextGioiTinh);
        pre=view.findViewById(R.id.preGioiTinh);
        gioitinh=view.findViewById(R.id.etgioitinh);
        ngaySinh=view.findViewById(R.id.ngaysinh);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new AddIntroFragment());
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gioitinh.getText().toString().equals("Nữ"))
                    gioitinh.setText(String.valueOf("Nam"));
                    else
                        gioitinh.setText("Nữ");
            }
        });

        ngaySinh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    if(event.getRawX() >= (ngaySinh.getRight() - ngaySinh.getCompoundDrawables()[2].getBounds().width())) {
                        Calendar newCalendar = dateSelected;
                        datePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {

                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                dateSelected.set(year, monthOfYear, dayOfMonth, 0, 0);
                                ngaySinh.setText(dayOfMonth+"/"+monthOfYear+"/"+year);
                            }

                        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

                        datePickerDialog.show();
                        return true;
                    }
                }
                return false;
            }
        });

        return view;
    }

}
