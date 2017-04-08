package com.example.pianoafrik.mestcollabsapp.models;

/**
 * Created by Neville Masheti on 4/5/2017.
 */

public class Shares {

    public int id;
    public String time_ago;
    public Mester mester;

    public Shares(int id, String time_ago, Mester mester) {
        this.id = id;
        this.time_ago = time_ago;
        this.mester = mester;
    }
}
