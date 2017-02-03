package com.domikado.rxjavasimpleretrofit;
// Created by irwancannady (irwancannady@gmail.com) on 2/3/17 at 3:02 PM.

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.domikado.rxjavasimpleretrofit.model.AndroidModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<AndroidModel> androidModels;

    public DataAdapter(ArrayList<AndroidModel> androidModels) {
        this.androidModels = androidModels;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {

        holder.tv_version.setText(androidModels.get(position).getVer());
        holder.tv_name.setText(androidModels.get(position).getName());
        holder.tv_api_level.setText(androidModels.get(position).getApi());

    }

    @Override
    public int getItemCount() {
        return androidModels.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_version)
        TextView tv_version;

        @BindView(R.id.tv_name)
        TextView tv_name;

        @BindView(R.id.tv_api_level)
        TextView tv_api_level;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

