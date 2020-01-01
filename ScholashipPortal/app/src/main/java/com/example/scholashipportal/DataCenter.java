package com.example.scholashipportal;

import com.example.scholashipportal.model.ScholashipFavorite;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {

    private DataCenter instance;

    public List<ScholashipFavorite> lsFavorite;

    public DataCenter Instance(){
        if(instance==null)
            instance=new DataCenter();

        return instance;
    }

    public DataCenter() {
        lsFavorite= new ArrayList<>();
    }
}
