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

public class ImbizoFragment extends Fragment
{
    ListView listView;
    ImageView listImage;
    int[] imageResource = new int[] {R.drawable.imbizo_shisanyama,R.drawable.kwathemba_attraction};
    public ImbizoFragment ()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Imbizo> imbizo = new ArrayList<Imbizo>();
        imbizo.add(new Imbizo("Imbizo","This place accommodates about 900 people",1997,"The secret to the restaurant’s success is found in the deep understanding of African culture and heritage. Over the years patrons have become part of the BUSY CORNER Imbizo Shisanyama family and their high brand ownership has seen the restaurant grow from success to success.",R.drawable.ic_jump_song_art_web));
        imbizo.add(new Imbizo("Kwathemba","This place accommodates about 50 people",200,"This place has been around for a while, and it remains unchanged. The owners pride themselves with operating in such conditions.", R.drawable.ic_maneater_song_art_web));

        final ImbizoAdapter adapter = new ImbizoAdapter(getActivity(), imbizo);
        listView = rootView.findViewById(R.id.content_listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(),"This guy has been clicked "+position, Toast.LENGTH_LONG).show();

                listImage = rootView.findViewById(R.id.list_Image);
                listImage.setImageResource(imageResource[position]);
            }
        });

        return rootView;
    }
}
