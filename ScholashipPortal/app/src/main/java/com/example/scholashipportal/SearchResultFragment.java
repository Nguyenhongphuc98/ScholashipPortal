package com.example.scholashipportal;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.scholashipportal.adapter.SearchResultAdaptor;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchResultFragment extends Fragment {

    ListView lvSearchResult;
    SearchResultAdaptor adaptor;
    String data[]={"a","a","a","a","a","a","a","a"};

    public SearchResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search_result, container, false);

        lvSearchResult=view.findViewById(R.id.lvSearchResult);
        adaptor=new SearchResultAdaptor(getContext(),data);
        lvSearchResult.setAdapter(adaptor);


        return view;
    }

}
