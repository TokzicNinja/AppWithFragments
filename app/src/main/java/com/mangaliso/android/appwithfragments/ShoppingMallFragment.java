package com.mangaliso.android.appwithfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShoppingMallFragment extends Fragment
{
    ListView listView;
    ImageView listImage;
    int[] imageResource = new int[]{R.drawable.ebony_park_mall, R.drawable.kaalfontein_corner_mall, R.drawable.yarona_mall};

    public ShoppingMallFragment ()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<ShoppingMall> mall = new ArrayList<ShoppingMall>();
        mall.add(new ShoppingMall("Ebony Park Shopping Centre","This place accommodates about 900 people","This place was established the year 2004","It might look like a small establishment, but it accommodates half of the area's population",R.drawable.ic_jump_song_art_web));
        mall.add(new ShoppingMall("Kaalfontein Corner","Accommodates about 900 people","It recently got established","The place is located in a convenient location which can be accessible to people in Kaalfontein,Thembakhoza and Ivory Park ext 15", R.drawable.ic_maneater_song_art_web));
        mall.add(new ShoppingMall("Yarona Shopping Centre","The place currently accommodates about 500 people","It was established in the year 2011","Something,something, something",R.drawable.ic_dreaming_song_art_web));
        ShoppingMallAdapter adapter = new ShoppingMallAdapter(getActivity(), mall);
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