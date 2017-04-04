package com.example.pianoafrik.mestcollabsapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.pianoafrik.mestcollabsapp.adapters.CompanyAdapter;
import com.example.pianoafrik.mestcollabsapp.models.Company;
import com.example.pianoafrik.mestcollabsapp.utilities.Globall;
import com.example.pianoafrik.mestcollabsapp.R;
import com.example.pianoafrik.mestcollabsapp.adapters.FeedsAdapter;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;

public class CompanyFragment extends Fragment {
    private ListView listView;
    private CompanyAdapter myAppAdapter;
    private ArrayList<Feeds> feedsArrayList;
    Bundle savedInstanceState;


    public CompanyFragment() {
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
        View view = inflater.inflate(R.layout.company_fragment, container, false);

        listView= (ListView)view.findViewById(R.id.listView);
        //Log.e("Confirm", "Confirmed>>>>"+Globall.sel_servicez.get(0));
        Company asoriba= new Company("Asoriba", "church management", "logo", "nana@asoriba.com", "www.asoriba.com", "+233 722 605 78543", "angel","crunchabase","twitter","facebook","linkedIn");
        Company devless= new Company("Devless", "church management", "logo", "nana@asoriba.com", "www.asoriba.com", "+233 722 605 78543", "angel","crunchabase","twitter","facebook","linkedIn") ;
        Company beam= new Company("Beam", "church management", "logo", "nana@asoriba.com", "www.asoriba.com", "+233 722 605 78543", "angel","crunchabase","twitter","facebook","linkedIn") ;
        Globall.all_companies.add(asoriba);
        Globall.all_companies.add(devless);
        Globall.all_companies.add(beam);


        myAppAdapter=new CompanyAdapter(Globall.all_companies, getContext());
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
