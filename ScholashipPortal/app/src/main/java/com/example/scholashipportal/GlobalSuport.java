package com.example.scholashipportal;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class GlobalSuport {

    public static FragmentActivity activity;
    public static boolean preIsFavoriteList = false;
    public static boolean preIsFavoriteApply = false;

    public static void ReplaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransition=activity.getSupportFragmentManager().beginTransaction();
        fragmentTransition.setCustomAnimations(R.anim.fade_in_left,R.anim.fade_out);
        fragmentTransition.replace(R.id.fragment_container,fragment);
        fragmentTransition.commit();
    }
}
