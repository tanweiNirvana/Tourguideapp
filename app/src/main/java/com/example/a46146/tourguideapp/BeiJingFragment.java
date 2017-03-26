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

public class BeiJingFragment extends Fragment {
    private List<TourGuide> sceneryList = new ArrayList<>();
    private List<TourGuide> restaurantList = new ArrayList<>();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        //create scenery
        TourGuide tianAnMen = new TourGuide(R.drawable.tian_an_men, getString(R.string.tian_an_men));
        TourGuide changCheng = new TourGuide(R.drawable.chang_cheng, getString(R.string.chang_cheng));
        TourGuide shuiLiFang = new TourGuide(R.drawable.shui_li_fang, getString(R.string.shui_li_fang));
        TourGuide niaoChao = new TourGuide(R.drawable.niao_chao, getString(R.string.niao_chao));
        sceneryList.add(tianAnMen);
        sceneryList.add(changCheng);
        sceneryList.add(shuiLiFang);
        sceneryList.add(niaoChao);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_scenery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        TourGuideAdapter sceneryAdapter = new TourGuideAdapter(sceneryList);
        recyclerView.setAdapter(sceneryAdapter);

        //create restaurant
        TourGuide beiJingFanDian = new TourGuide(R.drawable.bei_jing_fan_dian, getString(R.string.bei_jing_fan_dian));
        TourGuide liJiaCai = new TourGuide(R.drawable.li_jia_cai, getString(R.string.li_jia_cai));
        TourGuide quanJuDe = new TourGuide(R.drawable.quan_ju_de, getString(R.string.quan_ju_de));
        restaurantList.add(beiJingFanDian);
        restaurantList.add(liJiaCai);
        restaurantList.add(quanJuDe);
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
