package com.example.pager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: {
                FragmentOne fragmentOne = new FragmentOne();
                return fragmentOne;
            }
            case 1: {
                FragmentTwo fragmentTwo = new FragmentTwo();
                return fragmentTwo;
            }
            case 2: {
                FragmentThree fragmentThree = new FragmentThree();
                return fragmentThree;
            }
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
