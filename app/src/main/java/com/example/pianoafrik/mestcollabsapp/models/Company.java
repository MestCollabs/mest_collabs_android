package com.example.pianoafrik.mestcollabsapp.models;

/**
 * Created by Neville Masheti on 4/3/2017.
 */

public class Company {

    public String cName, cDescription, logoUrl, email, website, phone, angel, crunchbase, twitter, facebook, linkedIn;

    public Company(String cName, String cDescription, String logoUrl, String email, String website, String phone, String angel, String crunchbase, String twitter, String facebook, String linkedIn) {
        this.cName = cName;
        this.cDescription = cDescription;
        this.logoUrl = logoUrl;
        this.email = email;
        this.website = website;
        this.phone = phone;
        this.angel = angel;
        this.crunchbase = crunchbase;
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAngel() {
        return angel;
    }

    public void setAngel(String angel) {
        this.angel = angel;
    }

    public String getCrunchbase() {
        return crunchbase;
    }

    public void setCrunchbase(String crunchbase) {
        this.crunchbase = crunchbase;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
}
