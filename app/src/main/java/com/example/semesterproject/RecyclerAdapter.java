package com.example.semesterproject;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private ArrayList<DataBean> arr_bean;

    public RecyclerAdapter(ArrayList<DataBean> arr_bean) {
        this.arr_bean = arr_bean;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.tv_title.setText(arr_bean.get(position).getLangName());
        holder.im_image.setImageResource(arr_bean.get(position).getImage());
    }
    @Override
    public int getItemCount() {
        return arr_bean.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title;
        ImageView im_image;
        public MyViewHolder(View view) {
            super(view);
            tv_title = (TextView) view.findViewById(R.id.tv_langName);
            im_image = (ImageView) view.findViewById(R.id.im_test);
        }
    }
}

