package com.example.adriana.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Adriana on 6/3/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int nrOfTabs;

    public PagerAdapter(FragmentManager fm, int nrOfTabs) {
        super(fm);
        this.nrOfTabs = nrOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HotelsFragment();

            case 1:
                return new RestaurantsFragment();

            case 2:
                return new MuseumsFragment();

            case 3:
                return new BuildingsFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nrOfTabs;
    }
}
