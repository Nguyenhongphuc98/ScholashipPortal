package com.example.scholashipportal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private boolean isInfoCreated=false;

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private HomeFragment mHomeFragment;
    private SearchResultFragment mSearchResulfFragment;
    private ScholashipDetailFragment mScholashipDetailFragment;
    private InforFragment mInfoFragment;
    private AddEducationFragment mAddEduFragment;
    private InfoEmptyFragment mInfoEmptyFracment;
    private FavoriteFragment mFavoriteFragment;
    private ExploreFragment mExploreFtacment;
    private AddAwardFragment mAddAwardFracment;
    private AddInfoFragment mAddInfoFracment;
    private AddIntroFragment mAddIntroFracment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        GlobalSuport.activity=this;

        mHomeFragment=new HomeFragment();
        mSearchResulfFragment=new SearchResultFragment();
        mScholashipDetailFragment=new ScholashipDetailFragment();
        mInfoFragment=new InforFragment();
        mFavoriteFragment=new FavoriteFragment();
        mExploreFtacment=new ExploreFragment();

        mAddEduFragment=new AddEducationFragment();
        mInfoEmptyFracment=new InfoEmptyFragment();
        mAddAwardFracment=new AddAwardFragment();
        mAddInfoFracment=new AddInfoFragment();
        mAddIntroFracment=new AddIntroFragment();

        MatchView();
        SetEventBottomNavBar();
        ReplaceFragment(mHomeFragment);
    }

    void MatchView(){
        mMainNav= (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mMainFrame=findViewById(R.id.fragment_container);
    }

    void SetEventBottomNavBar(){
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_home:
                        ReplaceFragment(mHomeFragment);
                        return true;
                    case R.id.action_favorite:
                        ReplaceFragment(mFavoriteFragment);
                        return true;
                    case R.id.action_info:
                        if(isInfoCreated)
                            ReplaceFragment(mInfoFragment);
                        else
                        {
                            ReplaceFragment(mInfoEmptyFracment);
                            isInfoCreated=true;
                        }

                        return true;

                    case R.id.action_explore:
                        ReplaceFragment(mExploreFtacment);
                        return true;
                }
                return false;
            }
        });
    }

    private void ReplaceFragment(Fragment fragment){
        GlobalSuport.ReplaceFragment(fragment);
    }
}
