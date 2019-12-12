package com.example.scholashipportal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.scholashipportal.GlobalSuport;
import com.example.scholashipportal.R;
import com.example.scholashipportal.ScholashipDetailFragment;

public class SearchResultAdaptor extends ArrayAdapter {

    Context context;

    public SearchResultAdaptor(@NonNull Context context, String temp[]) {
        super(context,  R.layout.card_search_result,temp);
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View viewRow= convertView;

        if(viewRow==null){
            viewRow=layoutInflater.inflate(R.layout.card_search_result,parent,false);


        }

        View view=viewRow.findViewById(R.id.itemScholaship);
        view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new ScholashipDetailFragment());
            }
        });

        return viewRow;
    }
}
