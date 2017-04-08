package com.example.pianoafrik.mestcollabsapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.pianoafrik.mestcollabsapp.utilities.Fetch;
import com.example.pianoafrik.mestcollabsapp.utilities.Globall;
import com.example.pianoafrik.mestcollabsapp.R;
import com.example.pianoafrik.mestcollabsapp.adapters.FeedsAdapter;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;

public class FeedsFragment extends Fragment {
    private ListView listView;
    private FeedsAdapter myAppAdapter;
    private ArrayList<Feeds> feedsArrayList;
    Bundle savedInstanceState;


    public FeedsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.savedInstanceState=savedInstanceState;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.feeds_fragment, container, false);

        listView= (ListView)view.findViewById(R.id.listView);

        myAppAdapter=new FeedsAdapter(Globall.all_feeds, getContext());

        listView.setAdapter(myAppAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

            }
        });






        return view;

    }





}
