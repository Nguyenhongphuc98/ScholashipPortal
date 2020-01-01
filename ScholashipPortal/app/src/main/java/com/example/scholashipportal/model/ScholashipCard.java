package com.example.scholashipportal.model;

import com.example.scholashipportal.R;

import java.util.ArrayList;

public class ScholashipCard {

    private String mName;
    private String mDeadline;
    private int cover;
    private int avatarOfCompany;

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getAvatarOfCompany() {
        return avatarOfCompany;
    }

    public void setAvatarOfCompany(int avatarOfCompany) {
        this.avatarOfCompany = avatarOfCompany;
    }

    public ScholashipCard(String mName, String mDeadline, int cover, int avatarOfCompany) {
        this.mName = mName;
        this.mDeadline = mDeadline;
        this.cover = cover;
        this.avatarOfCompany = avatarOfCompany;
    }

    public String getName() {
        return mName;
    }

    public String getmDeadline() {
        return mDeadline;
    }


    public static ArrayList<ScholashipCard> createScholoshipList() {
        ArrayList<ScholashipCard> contacts = new ArrayList<ScholashipCard>();

        contacts.add(new ScholashipCard("Du học Nhật" , "22/12/2019", R.drawable.banner,R.drawable.micro));
        contacts.add(new ScholashipCard("Du học Mỹ" , "11/03/2019",R.drawable.scholarship_cover3,R.drawable.nokia));
        contacts.add(new ScholashipCard("Học bổng tài năng" , "05/04/2019",R.drawable.scholarship_cover4,R.drawable.icon_company));
        contacts.add(new ScholashipCard("Ươm mầm trí tuệ" , "01/02/2019",R.drawable.banner,R.drawable.tiki));

        return contacts;
    }
}
