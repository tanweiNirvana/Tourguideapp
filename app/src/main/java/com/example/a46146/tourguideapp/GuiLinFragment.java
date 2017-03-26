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

public class GuiLinFragment extends Fragment {
    private List<TourGuide> sceneryList = new ArrayList<>();
    private List<TourGuide> restaurantList = new ArrayList<>();

    public GuiLinFragment() {
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        //create scenery
        TourGuide liJiang = new TourGuide(R.drawable.li_jiang, getString(R.string.li_jiang));
        TourGuide yangShuo = new TourGuide(R.drawable.yang_shuo, getString(R.string.yang_shuo));
        TourGuide xiangBiShan = new TourGuide(R.drawable.xiang_bi_shan, getString(R.string.xiang_bi_shan));
        TourGuide leManDi = new TourGuide(R.drawable.le_man_di, getString(R.string.le_man_di));
        sceneryList.add(liJiang);
        sceneryList.add(yangShuo);
        sceneryList.add(xiangBiShan);
        sceneryList.add(leManDi);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_scenery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        TourGuideAdapter sceneryAdapter = new TourGuideAdapter(sceneryList);
        recyclerView.setAdapter(sceneryAdapter);

        //create restaurant
        TourGuide haiDiLao = new TourGuide(R.drawable.hai_di_lao, getString(R.string.hai_di_lao));
        TourGuide guZaoWEi = new TourGuide(R.drawable.gu_zao, getString(R.string.gu_zao));
        restaurantList.add(haiDiLao);
        restaurantList.add(guZaoWEi);
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
