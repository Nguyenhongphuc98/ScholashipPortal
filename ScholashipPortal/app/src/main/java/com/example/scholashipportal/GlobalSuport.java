package com.example.scholashipportal;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class GlobalSuport {

    public static FragmentActivity activity;

    public static void ReplaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransition=activity.getSupportFragmentManager().beginTransaction();
        fragmentTransition.replace(R.id.fragment_container,fragment);
        fragmentTransition.commit();
    }
}
