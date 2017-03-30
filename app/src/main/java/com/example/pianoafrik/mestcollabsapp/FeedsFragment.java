package com.example.pianoafrik.mestcollabsapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class FeedsFragment extends Fragment {
    private ListView listView;
    private MyAppAdapter myAppAdapter;
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


        myAppAdapter=new MyAppAdapter(Globall.all_feeds, getActivity());
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


    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            LinearLayout btnShare, btnLike, btnComment;

            TextView txtName, postDetails, postContent, numberOfComments, numberOfLikes ;
            ImageView profilePic;


        }

        public List<Feeds> parkingList;

        public Context context;
        ArrayList<Feeds> arraylist;

        private MyAppAdapter(List<Feeds> apps, Context context) {
            this.parkingList = apps;
            this.context = context;
            arraylist = new ArrayList<Feeds>();
            arraylist.addAll(parkingList);

        }

        @Override
        public int getCount() {
            return parkingList.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            MyAppAdapter.ViewHolder viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater(savedInstanceState);
                rowView = inflater.inflate(R.layout.feed_card, null);

                // configure view holder
                viewHolder = new ViewHolder();
                viewHolder.txtName = (TextView)rowView.findViewById(R.id.txtName);
                viewHolder.profilePic=(ImageView)rowView.findViewById(R.id.profilePic);
                viewHolder.postDetails = (TextView)rowView.findViewById(R.id.postDate);
                viewHolder.postContent = (TextView)rowView.findViewById(R.id.txtPostContent);




                rowView.setTag(viewHolder);

            } else {
                viewHolder = (MyAppAdapter.ViewHolder) convertView.getTag();
            }



            viewHolder.txtName.setText(parkingList.get(position).getPostedBy());
            viewHolder.postDetails.setText(parkingList.get(position).getDatePosted()+" at "+parkingList.get(position).getTimePosted());
            viewHolder.postContent.setText(parkingList.get(position).getFeedText());


            return rowView;


        }


    }



}
