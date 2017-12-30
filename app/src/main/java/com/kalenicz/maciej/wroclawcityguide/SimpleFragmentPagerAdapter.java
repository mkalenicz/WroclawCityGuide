package com.kalenicz.maciej.wroclawcityguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by maciej on 30.12.2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2) {
            return new DiningFragment();
        } else if (position == 3){
            return new RelaxFragment();
        }else {
            return new HotelsFragment();
        }
    }
}
