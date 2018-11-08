package com.mangaliso.android.appwithfragments;

public class MyPlace
{
        private String mName;
        private String mNumOfPeople;
        private String dateEstablished;
        private String additionalInfo;
        private int mResId;

        public MyPlace(String mName, String mNumOfPeople, String dateEstablished, String additionalInfo, int mResId) {
            this.mName = mName;
            this.mNumOfPeople = mNumOfPeople;
            this.dateEstablished = dateEstablished;
            this.additionalInfo = additionalInfo;
            this.mResId = mResId;
        }

        public int getResId() {
            return mResId;
        }

        public void setResId(int mResId) {
            this.mResId = mResId;
        }

        public String getName() {
            return mName;
        }

        public String getNumOfPeople() {
            return mNumOfPeople;
        }

        public String getDateEstablished() {
            return dateEstablished;
        }

        public void setDateEstablished(String dateEstablished) {
            this.dateEstablished = dateEstablished;
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