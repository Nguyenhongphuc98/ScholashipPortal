package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.scholashipportal.adapter.FavoriteAdaptor;
import com.example.scholashipportal.adapter.SearchResultAdaptor;
import com.example.scholashipportal.model.ScholashipFavorite;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {

    Button btnFavotire;
    Button btnSave;

    ListView listView;
    FavoriteAdaptor adaptor;
    List<ScholashipFavorite> data;

    FavoriteAdaptor saveAdaptor;
    List<ScholashipFavorite> saveData;


    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_favorite, container, false);

        listView=view.findViewById(R.id.lvFavorite);
        btnFavotire=view.findViewById(R.id.btnYeuThich);
        btnSave=view.findViewById(R.id.btnDaLuu);

        data= new ArrayList<>();
        data.add(new ScholashipFavorite(R.drawable.nokia,"Ươm mầm trí tuệ","Du học","22/12/2022","new"));
        data.add(new ScholashipFavorite(R.drawable.apple,"Vượt khó học tốt","Hỗ trợ học phí","01/02/2052","Hot"));
        adaptor=new FavoriteAdaptor(getContext(),data);

        saveData= new ArrayList<>();
        saveData.add(new ScholashipFavorite(R.drawable.apple,"Thắp sáng tương lai","Hỗ trợ học phí","01/02/2052","Hot"));
        saveData.add(new ScholashipFavorite(R.drawable.tiki,"Vượt khó học tốt","Hỗ trợ học phí","21/02/2052","new"));
        saveData.add(new ScholashipFavorite(R.drawable.nokia,"Tài năng trẻ","Du học","22/10/2025","new"));
        saveData.add(new ScholashipFavorite(R.drawable.micro,"Vừ A Dính","Hỗ trợ học phí","01/02/2050","Hot"));
        saveData.add(new ScholashipFavorite(R.drawable.micro,"Ươm mầm trí tuệ","Du học","22/12/2022","new"));
        saveAdaptor=new FavoriteAdaptor(getContext(),saveData);

        listView.setAdapter(adaptor);

        addEvent();

        return view;
    }

    void addEvent(){
        btnFavotire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnFavotire.setBackgroundResource(R.drawable.button_green_corner);
                btnFavotire.setTextColor(getResources().getColor(R.color.white));

                btnSave.setBackgroundResource(R.drawable.button_white);
                btnSave.setTextColor(getResources().getColor(R.color.green));
                listView.setAdapter(adaptor);
                adaptor.notifyDataSetChanged();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSave.setBackgroundResource(R.drawable.button_green_corner);
                btnSave.setTextColor(getResources().getColor(R.color.white));

                btnFavotire.setBackgroundResource(R.drawable.button_white);
                btnFavotire.setTextColor(getResources().getColor(R.color.green));
                listView.setAdapter(saveAdaptor);
                saveAdaptor.notifyDataSetChanged();
            }
        });
    }

}
