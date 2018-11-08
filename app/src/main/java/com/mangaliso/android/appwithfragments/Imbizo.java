package com.mangaliso.android.appwithfragments;

public class Imbizo {
    private String mName;
    private String mNumOfPeople;
    private int mDateEstablished;
    private String additionalInfo;
    private int mResId;

    public int getResId() {
        return mResId;
    }

    public void setResId(int mResId) {
        this.mResId = mResId;
    }

    public Imbizo(String mName, String mNumOfPeople, int mDateEstablished, String additionalInfo, int mResId) {
        this.mName = mName;
        this.mNumOfPeople = mNumOfPeople;
        this.mDateEstablished = mDateEstablished;
        this.additionalInfo = additionalInfo;
        this.mResId = mResId;
    }

    public String getName() {
        return mName;
    }

    public String getNumOfPeople() {
        return mNumOfPeople;
    }

    public int getDateEstablished() {
        return mDateEstablished;
    }

    public void setDateEstablished(int mDateEstablished) {
        this.mDateEstablished = mDateEstablished;
    }

    public String getAddtionalInfo() {
        return additionalInfo;
    }

    public void setAddtionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setNumOfPeople(String mNumOfPeople) {
        this.mNumOfPeople = mNumOfPeople;
    }
}
