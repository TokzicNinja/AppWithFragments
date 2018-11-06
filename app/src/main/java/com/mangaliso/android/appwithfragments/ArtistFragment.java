package com.mangaliso.android.appwithfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArtistFragment extends Fragment
{

    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public ArtistFragment ()
    {
//        int page
//
//        Bundle args = new Bundle();
//        args.putInt(ARG_PAGE, page);
//        ArtistFragment fragment = new ArtistFragment();
//        fragment.setArguments(args);
//        return fragment;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mPage = getArguments().getInt(ARG_PAGE);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.artist_list, container, false);
        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist("Madonna", R.drawable.ic_jump_song_art_web));
        artists.add(new Artist("Nelly Furtado", R.drawable.ic_maneater_song_art_web));
        artists.add(new Artist("Kendrick Lamar", R.drawable.ic_how_much_a_dollar_song_art_web));
        artists.add(new Artist("Simmy", R.drawable.ic_ubala_song_art_web));
        artists.add(new Artist("Justin Timberlake", R.drawable.ic_what_goes_around_song_art_web));
        artists.add(new Artist("Laura Branigan", R.drawable.ic_self_control_song_art_web));
        artists.add(new Artist("Nas", R.drawable.ic_heaven_song_art_web));
        artists.add(new Artist("Jason Derulo", R.drawable.ic_solo_song_art_web));
        artists.add(new Artist("UB40", R.drawable.ic_song_our_own_song_song_art_web));
        artists.add(new Artist("Edwin Starr", R.drawable.ic_war_song_art_web));
        artists.add(new Artist("Khalid", R.drawable.ic_saved_song_art_web));
        artists.add(new Artist("Smallpools", R.drawable.ic_dreaming_song_art_web));
        ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);
        ListView listView = rootView.findViewById(R.id.artist_listView);
        listView.setAdapter(adapter);
        return rootView;
    }
}
