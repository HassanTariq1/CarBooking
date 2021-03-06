package com.inducesmile.rentacar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inducesmile.rentacar.R;
import com.inducesmile.rentacar.adapter.ReservationAdapter;
import com.inducesmile.rentacar.models.ReservationObject;

import java.util.ArrayList;
import java.util.List;


public class UpcomingFragment extends Fragment {

    private static final String TAG = UpcomingFragment.class.getSimpleName();

    private RecyclerView recyclerView;


    public UpcomingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.upcoming);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        ReservationAdapter mAdapter = new ReservationAdapter(getActivity(), getTestData());
        recyclerView.setAdapter(mAdapter);
        return view;
    }

    public List<ReservationObject> getTestData() {
        List<ReservationObject> mObjects = new ArrayList<ReservationObject>();
        mObjects.add(new ReservationObject(1, "Porche Fx", "Vildansvagen 20, 24273 Lund, Sweden", "July 30, 2017", "Time: 8:40 am", "$145", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Vildansvagen 20, 24273 Lund, Sweden", "July 30, 2017", "Time: 8:40 am", "$145", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Vildansvagen 20, 24273 Lund, Sweden", "July 30, 2017", "Time: 8:40 am", "$145", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Vildansvagen 20, 24273 Lund, Sweden", "July 30, 2017", "Time: 8:40 am", "$145", ""));
        return mObjects;
    }
}
