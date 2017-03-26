package com.example.a46146.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 46146 on 2017/3/18.
 */

public class SpotFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private android.support.v4.app.Fragment[] pages = new android.support.v4.app.Fragment[]{
            new BeiJingFragment(),
            new ShangHaiFragment(),
            new GuiLinFragment(),
            new ZhangJiaJieFragment()
    };
    private ArrayList<CharSequence> title = new ArrayList<>();


    public SpotFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        title.add(mContext.getString(R.string.beiJing));
        title.add(mContext.getString(R.string.shangHai));
        title.add(mContext.getString(R.string.guiLin));
        title.add(mContext.getString(R.string.zhangJiaJie));
    }

    @Override
    public Fragment getItem(int position) {
        return pages[position];
    }

    @Override
    public int getCount() {
        return pages.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
