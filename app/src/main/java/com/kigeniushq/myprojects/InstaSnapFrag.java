package com.kigeniushq.myprojects;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class InstaSnapFrag extends Fragment{

    ImageView imv;
    public InstaSnapFrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_insta_snap, container, false);
        imv = (ImageView)v.findViewById(R.id.syncGoogleImageView);
        Picasso.with(getActivity())
                .load("http://i61.tinypic.com/30b37sy.png")
                .into(imv);

        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
