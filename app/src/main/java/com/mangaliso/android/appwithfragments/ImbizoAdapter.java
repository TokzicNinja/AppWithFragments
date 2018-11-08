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

public class ImbizoAdapter extends BaseAdapter
{

    private ArrayList<Imbizo> imbizo;
    private LayoutInflater inflateAttractions;

    public ImbizoAdapter(Context c, ArrayList<Imbizo> imbizo)
    {
        this.imbizo = imbizo;
        inflateAttractions = LayoutInflater.from(c);
    }

    @Override
    public int getCount()
    {
        return imbizo.size();
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
        LinearLayout attractionLayout = (LinearLayout) inflateAttractions.inflate(R.layout.list_item, viewGroup, false);
        TextView attractionNameView = attractionLayout.findViewById(R.id.listItem_name_textView);
        TextView attractionNumberOfPeople = attractionLayout.findViewById(R.id.listItem_numberOfPeople_textView);
        TextView attractionDateEst = attractionLayout.findViewById(R.id.listItem_date_est_textView);
        TextView attractionAddInfo = attractionLayout.findViewById(R.id.listItem_add_info_textView);
        ImageView attractionImage = attractionLayout.findViewById(R.id.listItem_imageView);

        Imbizo currentAttraction  = imbizo.get(i);
        attractionNameView.setText(currentAttraction.getName());
        attractionNumberOfPeople.setText(currentAttraction.getNumOfPeople());
        attractionDateEst.setText("This place was established in the year "+(currentAttraction.getDateEstablished()));
        attractionAddInfo.setText(currentAttraction.getAddtionalInfo());
        attractionImage.setImageResource(currentAttraction.getResId());

        attractionLayout.setTag(i);
        return attractionLayout;
    }
}
