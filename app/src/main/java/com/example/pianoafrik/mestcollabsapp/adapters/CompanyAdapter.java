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
import com.example.pianoafrik.mestcollabsapp.models.Company;


import java.util.ArrayList;
import java.util.List;

public class CompanyAdapter extends BaseAdapter {

    public class ViewHolder {
        LinearLayout btnShare, btnLike, btnComment;

        TextView txtName, txtDescription, txtEmail, txtPhone, txtWebsite,txtHistory ;
        ImageView logoPic,imgCrunchbase, imgAngel, imgTwitter, imgFacebook, imgEmail, imgWebsite;


    }

    public List<Company> parkingList;

    public Context context;
    ArrayList<Company> arraylist;

    public CompanyAdapter(List<Company> apps, Context context) {
        this.parkingList = apps;
        this.context = context;
        arraylist = new ArrayList<Company>();
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
            rowView = inflater.inflate(R.layout.company_card, null);

            // configure view holder
            viewHolder = new ViewHolder();
            viewHolder.txtName = (TextView)rowView.findViewById(R.id.txtCname);
            viewHolder.txtDescription = (TextView)rowView.findViewById(R.id.txtDescription);
            viewHolder.txtEmail = (TextView)rowView.findViewById(R.id.txtEmail);
            viewHolder.txtHistory = (TextView)rowView.findViewById(R.id.txtHistory);
            viewHolder.logoPic=(ImageView)rowView.findViewById(R.id.logoPic);
            viewHolder.imgEmail=(ImageView)rowView.findViewById(R.id.imgEmail);
            viewHolder.imgWebsite=(ImageView)rowView.findViewById(R.id.imgWebsite);
            viewHolder.imgCrunchbase=(ImageView)rowView.findViewById(R.id.imgCrunchbase);
            viewHolder.imgAngel=(ImageView)rowView.findViewById(R.id.imgAngel);
            viewHolder.imgTwitter=(ImageView)rowView.findViewById(R.id.imgTwitter);
            viewHolder.imgFacebook=(ImageView)rowView.findViewById(R.id.imgFacebook);





            rowView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }



        viewHolder.txtName.setText(parkingList.get(position).getcName());
        viewHolder.txtDescription.setText(parkingList.get(position).getcDescription());



        return rowView;


    }


}
