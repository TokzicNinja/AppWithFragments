package com.mangaliso.android.appwithfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyPlaceFragment extends Fragment {

    ListView listView;
    ImageView listImage;
    int[] imageResource = new int[]{R.drawable.my_place};

    public MyPlaceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<MyPlace> varMyPlace = new ArrayList<MyPlace>();

        varMyPlace.add(new MyPlace("The Mthembu Residence", "This place about 5-6 people", "1994", "That's my place, I've been living there since 1996, fun fact: we moved in the day I was born", R.drawable.ic_jump_song_art_web));

        MyPlaceAdapter adapter = new MyPlaceAdapter(getActivity(), varMyPlace);
        ListView listView = rootView.findViewById(R.id.content_listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), "This guy has been clicked " + position, Toast.LENGTH_LONG).show();

                listImage = rootView.findViewById(R.id.list_Image);
                listImage.setImageResource(imageResource[position]);
            }
        });

        return rootView;
    }
}
