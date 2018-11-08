package com.mangaliso.android.appwithfragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter
{
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] {"Schools","My Place","Shopping Malls","Main Attractions"};
    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        if(position==0)
            return new SchoolsFragment();
        else if (position==1)
            return new MyPlaceFragment();
        else if(position==2)
            return new ShoppingMallFragment();
        else if(position==3)
            return new ImbizoFragment();
        else
            return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
