package com.example.pianoafrik.mestcollabsapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pianoafrik.mestcollabsapp.R;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;
import java.util.List;

public class FeedsAdapter extends BaseAdapter {

    public class ViewHolder {
        LinearLayout btnShare, btnLike, btnComment;

        TextView txtName, postDetails, postContent, numberOfComments, numberOfLikes ;
        ImageView profilePic,imgstar;


    }

    public List<Feeds> parkingList;

    public Context context;
    ArrayList<Feeds> arraylist;

    public FeedsAdapter(List<Feeds> apps, Context context) {
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
        ViewHolder viewHolder;

        if (rowView == null) {
            LayoutInflater inflater=LayoutInflater.from(context);
            rowView = inflater.inflate(R.layout.feed_card, null);

            // configure view holder
            viewHolder = new ViewHolder();
            viewHolder.txtName = (TextView)rowView.findViewById(R.id.txtName);
            viewHolder.profilePic=(ImageView)rowView.findViewById(R.id.profilePic);
            viewHolder.imgstar=(ImageView)rowView.findViewById(R.id.imgstar);
            viewHolder.postDetails = (TextView)rowView.findViewById(R.id.postDate);
            viewHolder.postContent = (TextView)rowView.findViewById(R.id.txtPostContent);




            rowView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }



        viewHolder.txtName.setText(parkingList.get(position).getMester().getName());
        viewHolder.postDetails.setText("Posted "+parkingList.get(position).getTime_ago());
        viewHolder.postContent.setText(parkingList.get(position).getBody());


        return rowView;


    }


}
