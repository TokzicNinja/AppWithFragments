package com.mangaliso.android.appwithfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SchoolsAdapter extends BaseAdapter {

    private ArrayList<Schools> schools;
    private LayoutInflater inflateSchools;

    public SchoolsAdapter(Context c,
                          ArrayList<Schools> schools) {
        this.schools = schools;
        inflateSchools = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return schools.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LinearLayout schoolLayout = (LinearLayout) inflateSchools.inflate(R.layout.list_item, viewGroup, false);
        TextView schoolNameView = schoolLayout.findViewById(R.id.listItem_name_textView);
        TextView schoolNumberOfPeople = schoolLayout.findViewById(R.id.listItem_numberOfPeople_textView);
        TextView schoolDateEst = schoolLayout.findViewById(R.id.listItem_date_est_textView);
        TextView schoolAddInfo = schoolLayout.findViewById(R.id.listItem_add_info_textView);
        ImageView schoolImage = schoolLayout.findViewById(R.id.listItem_imageView);

        Schools currentAttraction  = schools.get(i);
        schoolNameView.setText(currentAttraction.getName());
        schoolNumberOfPeople.setText(currentAttraction.getNumOfPeople());
        schoolDateEst.setText("This place was established in the year "+(currentAttraction.getDateEstablished()));
        schoolAddInfo.setText(currentAttraction.getAdditionalInfo());
        schoolImage.setImageResource(currentAttraction.getResId());

        schoolLayout.setTag(i);
        return schoolLayout;
    }
}