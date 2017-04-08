package com.example.pianoafrik.mestcollabsapp.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.pianoafrik.mestcollabsapp.models.Company;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;
import java.util.List;


public class Globall {

    public static String GET_FEEDS_URL="https://mestapi-staging.herokuapp.com/api/v1/feeds";
    public static String GET_TOKEN="https://mestapi-staging.herokuapp.com/authenticate";
    public static String APP_TOKEN="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhcHBfaWQiOjEsImV4cCI6MTUyMjYxMzk5Mn0.pzs5xyToFOtxx4sMkv9FN3NM8Kp3YrwEBk8aeXwOIUE";
    public static List<Feeds> all_feeds = new ArrayList<Feeds>();
    public static List<Company> all_companies = new ArrayList<Company>();








    public static boolean isConnectingToInternet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }

        }
        return false;
    }







}
