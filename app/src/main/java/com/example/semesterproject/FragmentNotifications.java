package com.example.semesterproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FragmentNotifications extends Fragment {

    RecyclerView rv;
    ArrayList<DataBean> arr_bean;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        rv = view.findViewById(R.id.my_recycler_view2);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        arr_bean = new ArrayList<>();

        DataBean ob1 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob1);

        DataBean ob2 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob2);

        DataBean ob3 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob3);

        DataBean ob4 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob4);

        DataBean ob5 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob5);

        DataBean ob6 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob6);

        DataBean ob7 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob7);

        DataBean ob8 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob8);

        DataBean ob9 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob9);

        DataBean ob10 = new DataBean(R.drawable.ic_notifications2, "Notification");
        arr_bean.add(ob10);
        
        rv.setAdapter(new RecyclerAdapter(arr_bean));
        return view;
    }
}