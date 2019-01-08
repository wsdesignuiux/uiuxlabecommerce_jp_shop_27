package e.wolfsoft1.uiuxlabecommerce_jp_shop_27.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop_27.fragment.Fragmemt_Viewpager_shop27;


public class Pants_ViewpagerAdapter_Shop27 extends FragmentPagerAdapter {
    public Pants_ViewpagerAdapter_Shop27(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragmemt_Viewpager_shop27();
                break;
            case 1:

                fragment = new Fragmemt_Viewpager_shop27();
                break;
            case 2:

                fragment = new Fragmemt_Viewpager_shop27();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
