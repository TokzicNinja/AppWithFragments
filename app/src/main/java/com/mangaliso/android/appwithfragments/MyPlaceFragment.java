package com.mangaliso.android.appwithfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyPlaceFragment extends Fragment
{
    public MyPlaceFragment()
    {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.my_place_list, container, false);
        ArrayList<MyPlace> varMyPlace = new ArrayList<MyPlace>();

        varMyPlace.add(new MyPlace("The Mthembu Residence","This place about 5-6 people","1994","That's my place, I've been living there since 1996, fun fact: we moved in the day I was born", R.drawable.ic_jump_song_art_web));

        MyPlaceAdapter adapter = new MyPlaceAdapter(getActivity(), varMyPlace);
        ListView listView = rootView.findViewById(R.id.myPlace_ListView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
