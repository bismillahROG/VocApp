package tech.infinitedev.shifu.vocapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by shifu on 7/12/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumbOfTabs;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[],
                            int mNumbOfTabsumb) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    // This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab2SMK();
            case 1:
                return new Tab1SMA();
            case 2:
                return new Tab3MA();
        }
        return null;
    }

    // This method return the titles for the Tabs in the Tab Strip
    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip
    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
