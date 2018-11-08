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

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolsFragment extends Fragment {
    ListView listView;
    ImageView listImage;
    int[] imageResource = new int[]{R.drawable.kaalfontein_high_2, R.drawable.oracle_high_school, R.drawable.tsoloso_ya_afrika};

    public SchoolsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList<Schools> schools = new ArrayList<Schools>();

        schools.add(new Schools("Kaalfontein Secondary", "This school accommodates about 1 400 students", "2010", "In the year 2010 Kaalfontein was just another ordinary school. But after the year 2014 it was recognized as one of the best schools in the area", R.drawable.ic_jump_song_art_web));
        schools.add(new Schools("Penelope Oracle High", "This school accommodates about 2000 pupils", "2006", "This school was built by an I.T company known as Oracle. This school produces the best students and most of them end up going to well-known tertiary institutions", R.drawable.ic_maneater_song_art_web));
        schools.add(new Schools("Tsoloso Ya Afrika High", "This school accommodates about 1600 students", "2005", "Before it was established, the students used to occupy the land which is now used by Kaalfontein Secondary.", R.drawable.ic_how_much_a_dollar_song_art_web));

        SchoolsAdapter adapter = new SchoolsAdapter(getActivity(), schools);
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
