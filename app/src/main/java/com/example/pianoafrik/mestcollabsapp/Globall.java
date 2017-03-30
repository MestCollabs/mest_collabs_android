package com.example.pianoafrik.mestcollabsapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.pianoafrik.mestcollabsapp.models.Feeds;

import java.util.ArrayList;
import java.util.List;


public class Globall {

    public static String API_URL  = "https://mobileApp/index.php";
    public static List<Feeds> all_feeds = new ArrayList<Feeds>();
    public static String apiStatus="";
    public static String userEmail="";
    public static String userPassword="";
    public static String userName="";
    public static int code=0;







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
