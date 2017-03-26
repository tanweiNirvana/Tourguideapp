package com.example.a46146.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 46146 on 2017/3/19.
 */

public class TourGuideAdapter extends RecyclerView.Adapter<TourGuideAdapter.ViewHolder> {
    private List<TourGuide> mTourGuideList;

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tourGuideIv;
        TextView tourGuideTv;

        public ViewHolder(View itemView) {
            super(itemView);
            tourGuideIv = (ImageView) itemView.findViewById(R.id.recycler_iv);
            tourGuideTv = (TextView) itemView.findViewById(R.id.recycler_tv);
        }
    }

    public TourGuideAdapter(List<TourGuide> mTourGuideList) {
        this.mTourGuideList = mTourGuideList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TourGuide tourGuide = mTourGuideList.get(position);
        holder.tourGuideIv.setImageResource(tourGuide.getmCityIv());
        holder.tourGuideTv.setText(tourGuide.getmCityTv());
    }

    @Override
    public int getItemCount() {
        return mTourGuideList.size();
    }

}
