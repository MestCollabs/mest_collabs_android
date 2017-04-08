package com.example.pianoafrik.mestcollabsapp.activities;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import android.widget.FrameLayout;

import com.example.pianoafrik.mestcollabsapp.R;
import com.example.pianoafrik.mestcollabsapp.adapters.ViewPagerAdapter;
import com.example.pianoafrik.mestcollabsapp.fragments.CompanyFragment;
import com.example.pianoafrik.mestcollabsapp.fragments.FeedsFragment;
import com.example.pianoafrik.mestcollabsapp.utilities.Fetch;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.getbase.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private Fetch fetch;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ViewPagerAdapter adapter;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab_post,fab_surveys, fab_contacts;
    private int[] tabIcons = {
            R.drawable.ic_action_feedicon,
            R.mipmap.power_white,
            R.drawable.ic_action_company,
            R.drawable.ic_action_people,
            R.drawable.ic_action_profile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.launcher_white);
        final FloatingActionsMenu fabMenu = (FloatingActionsMenu) findViewById(R.id.fab_menu);
        final FrameLayout frameLayout;
        fab_post = (FloatingActionButton) findViewById(R.id.fab_profile);
        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        frameLayout.getBackground().setAlpha(0);


        fab_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        fabMenu.setOnFloatingActionsMenuUpdateListener(new FloatingActionsMenu.OnFloatingActionsMenuUpdateListener() {
            @Override
            public void onMenuExpanded() {
                frameLayout.getBackground().setAlpha(240);
                frameLayout.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        fabMenu.collapse();
                        return true;
                    }
                });


            }

            @Override
            public void onMenuCollapsed() {
                frameLayout.getBackground().setAlpha(0);
                frameLayout.setOnTouchListener(null);

            }
        });




        viewPager = (ViewPager) findViewById(R.id.container);
        //initAdapter();
        //viewPager.setAdapter(adapter);


        tabLayout = (TabLayout) findViewById(R.id.tabs);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();




        fetch=new Fetch(this, viewPager , adapter);
        fetch.get_feeds();

    }


    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FeedsFragment(),"");
        adapter.addFrag(new CompanyFragment(), "");
        adapter.addFrag(new CompanyFragment(), "");

        adapter.addFrag(new FeedsFragment(), "");
        adapter.addFrag(new FeedsFragment(), "");


        viewPager.setAdapter(adapter);
    }



}