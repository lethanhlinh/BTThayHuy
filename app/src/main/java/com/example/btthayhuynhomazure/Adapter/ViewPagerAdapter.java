package com.example.btthayhuynhomazure.Adapter;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.btthayhuynhomazure.Fragment.BookFragment;
import com.example.btthayhuynhomazure.Fragment.HomeFragment;
import com.example.btthayhuynhomazure.Fragment.PersonalFragment;
import com.example.btthayhuynhomazure.Fragment.SearchFragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new BookFragment();
            case 2:
                return new SearchFragment();
            case 3:
                return new PersonalFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

