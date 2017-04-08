package com.example.pianoafrik.mestcollabsapp.models;

import java.util.ArrayList;

public class Feeds {

    public String body, picture,time_ago;
    public Mester mester;
    public int id, mester_id;
    public ArrayList<Feedback> feedbacks;
    public ArrayList<Shares> shares;


    public Feeds(int id, String body, String picture, String time_ago, Mester mester, ArrayList<Feedback> feedbacks, ArrayList<Shares> shares) {
        this.feedbacks=new ArrayList<Feedback>();
        this.shares=new ArrayList<Shares>();
        this.feedbacks=feedbacks;
        this.shares=shares;
        this.id=id;
        this.body = body;
        this.picture = picture;
        this.time_ago = time_ago;
        this.mester=new Mester(mester.id, mester.name, mester.email, mester.profilePicture);
    }

    public Feeds(int id, String body, String picture, Mester mester, String time_ago) {
        this.id=id;
        this.body = body;
        this.picture = picture;
        this.time_ago = time_ago;
        this.mester=new Mester(mester.id, mester.name, mester.email, mester.profilePicture);
    }

    public Feeds( String body, String picture, int mester_id) {
        this.mester_id=mester_id;
        this.body = body;
        this.picture = picture;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTime_ago() {
        return time_ago;
    }

    public void setTime_ago(String time_ago) {
        this.time_ago = time_ago;
    }

    public Mester getMester() {
        return mester;
    }

    public void setMester(Mester mester) {
        this.mester = mester;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMester_id() {
        return mester_id;
    }

    public void setMester_id(int mester_id) {
        this.mester_id = mester_id;
    }
}
