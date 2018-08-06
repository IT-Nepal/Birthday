package com.example.ubuntu.specialday;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup groupView, Bundle savedInstanceState){

        return inflater.inflate(R.layout.home_fragment_layout, groupView, false);

    }
}
