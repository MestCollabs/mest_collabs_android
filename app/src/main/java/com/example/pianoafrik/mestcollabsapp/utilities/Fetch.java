package com.example.pianoafrik.mestcollabsapp.utilities;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.pianoafrik.mestcollabsapp.R;
import com.example.pianoafrik.mestcollabsapp.adapters.FeedsAdapter;
import com.example.pianoafrik.mestcollabsapp.models.Feeds;
import com.example.pianoafrik.mestcollabsapp.models.Mester;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Neville Masheti on 4/4/2017.
 */

public class Fetch {

    Context context;
    String app_token, auth;
    Map<String, String> headers;
    ProgressDialog progressDialog;
    private FeedsAdapter myAppAdapter;
    ListView listView;

    public Fetch(Context context, ListView listView)
    {
        this.context=context;
        this.listView=listView;
        headers =  new HashMap<>();
        app_token=this.context.getResources().getString(R.string.app_token);
        auth="Bearer " + this.app_token;
        headers.put("Authorization: ", this.auth);
        progressDialog = new ProgressDialog(this.context);

    }

    public void get_feeds()
    {
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        RequestQueue queue = Volley.newRequestQueue(context);

        // Request a string response from the provided URL.
        CustomStringRequest stringRequest = new CustomStringRequest(Request.Method.GET, Globall.GET_FEEDS_URL, headers,
                new Response.Listener<String>() {


                    @Override
                    public void onResponse(String response) {
                        //Log.e("Response: ", "Res: "+response);


                        try {
                            JSONObject jsonObject = new JSONObject(response);


                            JSONArray jsonArray = jsonObject.getJSONArray("feeds");
                            Globall.all_feeds.clear();
                            //Log.e("Array", "Array : "+jsonArray.toString());

                            for(int i =0; i<jsonArray.length(); i++){

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                                JSONObject feedObject = jsonObject1.getJSONObject("feed");
                                Log.e("Object", "Object feed : "+feedObject.toString());
                                JSONObject mesterObject = jsonObject1.getJSONObject("source");
                                Log.e("Object", "Object mester : "+mesterObject.toString());
                                String  feed_duration = jsonObject1.getString("feed_duration");
                                Log.e("dur", "Duration : "+feed_duration);

                                Mester mester= new Mester(mesterObject.getInt("id"), mesterObject.getString("name"), mesterObject.getString("email"),
                                        mesterObject.getString("profilePicture"));

                                Feeds feed_new= new Feeds(feedObject.getInt("id"),feedObject.getString("body"),feedObject.getString("picture"), mester, feed_duration);

                                Globall.all_feeds.add(feed_new);

                            }
                            myAppAdapter=new FeedsAdapter(Globall.all_feeds, context);
                            Log.e("all", "all feeds "+Globall.all_feeds.get(0).getBody());
                            listView.setAdapter(myAppAdapter);

                            progressDialog.dismiss();


                        } catch (JSONException e) {
                            progressDialog.dismiss();
                            Log.e("Catch", "catch:");
                            e.printStackTrace();
                        }




                    }
                },
                new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Log.e("Response: ", "error: "+error.toString());

                        //hello.setText(error.toString());
                        Toast.makeText(context, error.toString(), Toast.LENGTH_LONG).show();
                    }



                });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);

    }

}
