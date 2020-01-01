package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.scholashipportal.adapter.FavoriteAdaptor;
import com.example.scholashipportal.adapter.SearchResultAdaptor;
import com.example.scholashipportal.model.ScholashipFavorite;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchResultFragment extends Fragment {

    ListView lvSearchResult;
    FavoriteAdaptor adaptor;
    List<ScholashipFavorite> data;

    public SearchResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search_result, container, false);

        lvSearchResult=view.findViewById(R.id.lvSearchResult);

        data= new ArrayList<>();
        data.add(new ScholashipFavorite(R.drawable.apple,"Ươm mầm trí tuệ","Hỗ trợ học phí","23/05/2020","new"));
        data.add(new ScholashipFavorite(R.drawable.nokia,"Thắp sáng ước mơ","Du học","22/12/2022","new"));
        data.add(new ScholashipFavorite(R.drawable.icon_itun,"Vượt khó học tốt","Hỗ trợ học phí","01/02/2052","Hot"));
        data.add(new ScholashipFavorite(R.drawable.tiki,"Ước mơ tuổi trẻ","Du học","04/06/2022","new"));
        adaptor=new FavoriteAdaptor(getContext(),data);
        lvSearchResult.setAdapter(adaptor);


        return view;
    }

}
