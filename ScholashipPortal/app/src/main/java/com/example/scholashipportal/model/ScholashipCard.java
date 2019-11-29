package com.example.scholashipportal.model;

import java.util.ArrayList;

public class ScholashipCard {

    private String mName;
    private String mDeadline;

    public ScholashipCard(String name, String deadline) {
        mName = name;
        mDeadline = deadline;
    }

    public String getName() {
        return mName;
    }

    public String getmDeadline() {
        return mDeadline;
    }


    public static ArrayList<ScholashipCard> createScholoshipList() {
        ArrayList<ScholashipCard> contacts = new ArrayList<ScholashipCard>();

        contacts.add(new ScholashipCard("Du học Nhật" , "22/12/2019"));
        contacts.add(new ScholashipCard("Du học Mỹ" , "11/03/2019"));
        contacts.add(new ScholashipCard("Học bổng tài năng" , "05/04/2019"));
        contacts.add(new ScholashipCard("Ươm mầm trí tuệ" , "01/02/2019"));

        return contacts;
    }
}
