package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.scholashipportal.adapter.SearchResultAdaptor;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {

    Button btnFavotire;
    Button btnSave;

    ListView listView;
    SearchResultAdaptor adaptor;
    String data[]={"a","a","a","a","a","a","a","a"};


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


        adaptor=new SearchResultAdaptor(getContext(),data);
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
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSave.setBackgroundResource(R.drawable.button_green_corner);
                btnSave.setTextColor(getResources().getColor(R.color.white));

                btnFavotire.setBackgroundResource(R.drawable.button_white);
                btnFavotire.setTextColor(getResources().getColor(R.color.green));
            }
        });
    }

}
