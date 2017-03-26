package com.example.a46146.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ShangHaiFragment extends Fragment {
    private List<TourGuide> sceneryList = new ArrayList<>();
    private List<TourGuide> restaurantList = new ArrayList<>();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        //create scenery
        TourGuide diSiNi = new TourGuide(R.drawable.di_si_ni, getString(R.string.di_si_ni));
        TourGuide dongFangMingZhu = new TourGuide(R.drawable.dong_fang_ming_zhu, getString(R.string.dong_fang_ming_zhu));
        TourGuide shuiZuGuan = new TourGuide(R.drawable.shui_zu_guan, getString(R.string.shui_zu_guan));
        TourGuide huanLeGu = new TourGuide(R.drawable.huan_le_gu, getString(R.string.huan_le_gu));
        sceneryList.add(diSiNi);
        sceneryList.add(dongFangMingZhu);
        sceneryList.add(shuiZuGuan);
        sceneryList.add(huanLeGu);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_scenery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(ShangHaiFragment.this.getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        TourGuideAdapter sceneryAdapter = new TourGuideAdapter(sceneryList);
        recyclerView.setAdapter(sceneryAdapter);

        //create restaurant
        TourGuide d_Bar = new TourGuide(R.drawable.d_bar, getString(R.string.d_bar));
        TourGuide daPaiDang = new TourGuide(R.drawable.da_pai_dang, getString(R.string.da_pai_dang));
        TourGuide rongXinGuan = new TourGuide(R.drawable.rong_xin_guan, getString(R.string.rong_xin_guan));
        restaurantList.add(d_Bar);
        restaurantList.add(daPaiDang);
        restaurantList.add(rongXinGuan);
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recycler_restaurant);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView1.setLayoutManager(layoutManager1);
        TourGuideAdapter restaurantAdapter = new TourGuideAdapter(restaurantList);
        recyclerView1.setAdapter(restaurantAdapter);
        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
        sceneryList.clear();
        restaurantList.clear();
    }
}
