package com.example.pianoafrik.mestcollabsapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import com.example.pianoafrik.mestcollabsapp.adapters.FeedsAdapter;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;
import java.util.List;

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
        //Log.e("Confirm", "Confirmed>>>>"+Globall.sel_servicez.get(0));
        Feeds newFeed= new Feeds("", "11:30 Coding. #MeltwaterLife.", "Mar 21", "9:40pm", "12", "10", "Charles Agyemang") ;
        Feeds newFeeds= new Feeds("", "#ATS 2017 Coming to Nairobi. Let's cheer up fot the MESTERS", "Mar 21", "9:40pm", "12", "10", "Kelechi Udoagu") ;
        Feeds newFeedss= new Feeds("", "Convolyzer - an online platform for creating smart conversational surveys, distribute via multiple channels and genarate analytics. #SurveyTools", "Mar 21", "9:40pm", "12", "10", "Kelechi Udoagu") ;
        Globall.all_feeds.add(newFeed);
        Globall.all_feeds.add(newFeeds);
        Globall.all_feeds.add(newFeedss);


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
