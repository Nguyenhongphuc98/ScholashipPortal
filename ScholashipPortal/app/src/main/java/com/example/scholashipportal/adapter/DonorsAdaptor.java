package com.example.scholashipportal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.scholashipportal.CompaniInfoFragment;
import com.example.scholashipportal.GlobalSuport;
import com.example.scholashipportal.R;
import com.example.scholashipportal.ScholashipDetailFragment;

public class DonorsAdaptor extends ArrayAdapter {

    Context context;

    public DonorsAdaptor(@NonNull Context context, String temp[]) {
        super(context, R.layout.card_donors,temp);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View viewRow= convertView;

        if(viewRow==null){
            viewRow=layoutInflater.inflate(R.layout.card_donors,parent,false);


        }

        Button button=viewRow.findViewById(R.id.btnxem);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new CompaniInfoFragment());
            }
        });

        return viewRow;
    }

}
