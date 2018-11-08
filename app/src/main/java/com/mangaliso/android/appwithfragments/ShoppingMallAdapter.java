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

public class ShoppingMallAdapter extends BaseAdapter
{

    private ArrayList<ShoppingMall> malls;
    private LayoutInflater inflateMall;

    public ShoppingMallAdapter(Context c, ArrayList<ShoppingMall> malls)
    {
        this.malls = malls;
        inflateMall= LayoutInflater.from(c);
    }

    @Override
    public int getCount()
    {
        return malls.size();
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
        LinearLayout mallLayout = (LinearLayout) inflateMall.inflate(R.layout.list_item, viewGroup, false);
        TextView mallNameView = mallLayout.findViewById(R.id.listItem_name_textView);
        TextView mallNumberOfPeople = mallLayout.findViewById(R.id.listItem_numberOfPeople_textView);
        TextView mallDateEst = mallLayout.findViewById(R.id.listItem_date_est_textView);
        TextView mallAddInfo = mallLayout.findViewById(R.id.listItem_add_info_textView);
        ImageView mallImage = mallLayout.findViewById(R.id.listItem_imageView);

        ShoppingMall currentMall  = malls.get(i);
        mallNameView.setText(currentMall.getName());
        mallNumberOfPeople.setText(currentMall.getNumOfPeople());
        mallDateEst.setText(currentMall.getDateEstablished());
        mallAddInfo.setText(currentMall.getAddtionalInfo());
        mallImage.setImageResource(currentMall.getResId());

        mallLayout.setTag(i);
        return mallLayout;
    }

}
