package com.mangaliso.android.appwithfragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2018/11/01.
 */
public class MyPlaceAdapter extends BaseAdapter
{

    private ArrayList<MyPlace> varMyPlace;
    private LayoutInflater inflateAttractions;

    public MyPlaceAdapter(Context c, ArrayList<MyPlace> varMyPlace)
    {
        this.varMyPlace = varMyPlace;
        inflateAttractions = LayoutInflater.from(c);
    }

    @Override
    public int getCount()
    {
        return varMyPlace.size();
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LinearLayout myPlaceLayout = (LinearLayout) inflateAttractions.inflate(R.layout.list_item, viewGroup, false);
        TextView myPlaceNameView = myPlaceLayout.findViewById(R.id.listItem_name_textView);
        TextView myPlaceNumberOfPeople = myPlaceLayout.findViewById(R.id.listItem_numberOfPeople_textView);
        TextView myPlaceDateEst = myPlaceLayout.findViewById(R.id.listItem_date_est_textView);
        TextView myPlaceAddInfo = myPlaceLayout.findViewById(R.id.listItem_add_info_textView);
        ImageView myPlaceImage = myPlaceLayout.findViewById(R.id.listItem_imageView);

        MyPlace currentPlace  = varMyPlace.get(i);
        myPlaceNameView.setText(currentPlace.getName());
        myPlaceNumberOfPeople.setText(currentPlace.getNumOfPeople());
        myPlaceDateEst.setText("This place was established in the year "+(currentPlace.getDateEstablished()));
        myPlaceAddInfo.setText(currentPlace.getAddtionalInfo());
        myPlaceImage.setImageResource(currentPlace.getResId());

        myPlaceLayout.setTag(i);
        return myPlaceLayout;
    }
}
