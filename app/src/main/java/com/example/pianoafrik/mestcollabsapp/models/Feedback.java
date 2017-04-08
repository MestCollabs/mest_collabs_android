package com.example.pianoafrik.mestcollabsapp.models;

import java.util.ArrayList;

/**
 * Created by Neville Masheti on 4/5/2017.
 */

public class Feedback {
    public String body, time_ago;
    public Mester mester;


    public Feedback(String body,  Mester mester , String time_ago) {
        this.body = body;
        this.time_ago = time_ago;
        this.mester=new Mester(mester.id,mester.name, mester.email,mester.profilePicture);
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
}

