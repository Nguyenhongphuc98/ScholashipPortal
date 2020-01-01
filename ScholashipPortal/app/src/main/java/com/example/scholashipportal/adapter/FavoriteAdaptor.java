package com.example.scholashipportal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.scholashipportal.GlobalSuport;
import com.example.scholashipportal.R;
import com.example.scholashipportal.ScholashipDetailFragment;
import com.example.scholashipportal.model.ScholashipFavorite;

import java.util.List;

public class FavoriteAdaptor extends ArrayAdapter {
    Context context;
    List<ScholashipFavorite> lsData;

    public FavoriteAdaptor(@NonNull Context context, List datas) {
        super(context,  R.layout.card_search_result,datas);
        this.context=context;
        this.lsData=datas;
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
        TextView tag=viewRow.findViewById(R.id.tagScholaship);
        ImageView avt=viewRow.findViewById(R.id.avtCardScholashipResult);
        TextView name=viewRow.findViewById(R.id.nameScholaship);
        TextView type=viewRow.findViewById(R.id.typeScholaship);
        TextView deadline=viewRow.findViewById(R.id.deadlineScholaship);


        avt.setImageResource(lsData.get(position).getImg());
        name.setText(lsData.get(position).getName());
        type.setText(lsData.get(position).getType());
        deadline.setText(lsData.get(position).getDeadline());

        if((lsData.get(position).getTag().equals("Hot")))
        {
            tag.setBackgroundResource(R.drawable.tag_orange);
            tag.setText("Hot");
        }

        view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GlobalSuport.ReplaceFragment(new ScholashipDetailFragment());
            }
        });

        return viewRow;
    }
}
