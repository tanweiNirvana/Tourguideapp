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

public class ZhangJiaJieFragment extends Fragment {
    private List<TourGuide> sceneryList = new ArrayList<>();
    private List<TourGuide> restaurantList = new ArrayList<>();

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        //create scenery
        TourGuide tianMenShan = new TourGuide(R.drawable.tian_men_shan, getString(R.string.tian_men_shan));
        TourGuide biLingYuan = new TourGuide(R.drawable.bi_ling_yuan, getString(R.string.bi_ling_yuan));
        TourGuide boLiQiao = new TourGuide(R.drawable.bo_li_qiao, getString(R.string.bo_li_qiao));
        TourGuide laoDaoWan = new TourGuide(R.drawable.lao_dao_wan, getString(R.string.lao_dao_wan));
        sceneryList.add(tianMenShan);
        sceneryList.add(biLingYuan);
        sceneryList.add(boLiQiao);
        sceneryList.add(laoDaoWan);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_scenery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        TourGuideAdapter sceneryAdapter = new TourGuideAdapter(sceneryList);
        recyclerView.setAdapter(sceneryAdapter);

        //create restaurant
        TourGuide guoTie = new TourGuide(R.drawable.guo_tie, getString(R.string.guo_tie));
        TourGuide naiCha = new TourGuide(R.drawable.nai_cha, getString(R.string.nai_cha));
        TourGuide xiaLvDi = new TourGuide(R.drawable.xia_lv_di, getString(R.string.xia_lv_di));
        restaurantList.add(guoTie);
        restaurantList.add(naiCha);
        restaurantList.add(xiaLvDi);
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
