package com.example.scholashipportal;


import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.scholashipportal.adapter.DonorsAdaptor;
import com.example.scholashipportal.adapter.ScholashipCardAdaptor;
import com.example.scholashipportal.model.ScholashipCard;
import com.mancj.materialsearchbar.MaterialSearchBar;
import com.mancj.materialsearchbar.adapter.SuggestionsAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private List<String> lastSearches;
    private MaterialSearchBar searchBar;

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewNew;
    private ArrayList<ScholashipCard> cards;

    private String dataDonors[]={"a","a","a","a"};
    private DonorsAdaptor donorsAdaptor;
    private ListView lvDonors;

    ImageView iconSearch;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        searchBar=view.findViewById(R.id.searchBar);
        lvDonors=view.findViewById(R.id.lvDonors);
        recyclerView=view.findViewById(R.id.rvCards);
        recyclerViewNew=view.findViewById(R.id.rvCardsNew);
        iconSearch=view.findViewById(R.id.iconSearch);


        lastSearches=new ArrayList<String>();
        lastSearches.add("du học Mỹ");
        lastSearches.add("Học bổng tài năng");
        lastSearches.add("Khuyến học");
        searchBar.setLastSuggestions(lastSearches);

        donorsAdaptor=new DonorsAdaptor(getContext(),dataDonors);
        lvDonors.setAdapter(donorsAdaptor);

        cards=ScholashipCard.createScholoshipList();
        ScholashipCardAdaptor scholashipCardAdaptor=new ScholashipCardAdaptor(cards);
        recyclerView.setAdapter(scholashipCardAdaptor);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext());
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewNew.setAdapter(scholashipCardAdaptor);
        recyclerViewNew.setLayoutManager(linearLayoutManager2);


        searchBar.setSuggestionsClickListener(new SuggestionsAdapter.OnItemViewClickListener() {
            @Override
            public void OnItemClickListener(int position, View v) {
                GlobalSuport.ReplaceFragment(new SearchResultFragment());
            }

            @Override
            public void OnItemDeleteListener(int position, View v) {

            }
        });



        return view;
    }

}
