package com.mangaliso.android.appwithfragments;

import android.accessibilityservice.AccessibilityService;
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

public class AlbumFragment extends Fragment
{
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public AlbumFragment ()
    {
//        int page
//
//        newInstance
//        Bundle args = new Bundle();
//        args.putInt(ARG_PAGE, page);
//        AlbumFragment fragment = new AlbumFragment();
//        fragment.setArguments(args);
//        return fragment;
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        mPage = getArguments().getInt(ARG_PAGE);
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.album_list, container, false);
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Confessions on a Dance Floor", "Madonna", R.drawable.ic_jump_song_art_web));
        albums.add(new Album("Loose", "Nelly Furtado", R.drawable.ic_maneater_song_art_web));
        albums.add(new Album("To Pimp a Butterfly", "Kendrick Lamar", R.drawable.ic_how_much_a_dollar_song_art_web));
        albums.add(new Album("Single", "Simmy", R.drawable.ic_ubala_song_art_web));
        albums.add(new Album("FutureSex/LoveSounds", "Justin Timberlake", R.drawable.ic_what_goes_around_song_art_web));
        albums.add(new Album("Self-Control", "Laura Branigan", R.drawable.ic_self_control_song_art_web));
        albums.add(new Album("God's Son", "Nas", R.drawable.ic_heaven_song_art_web));
        albums.add(new Album("Jason Derulo", "Jason Derulo", R.drawable.ic_solo_song_art_web));
        albums.add(new Album("Rat in the Kitchen", "UB40", R.drawable.ic_song_our_own_song_song_art_web));
        albums.add(new Album("War & Peace", "Edwin Starr", R.drawable.ic_war_song_art_web));
        albums.add(new Album("American Teen", "Khalid", R.drawable.ic_saved_song_art_web));
        albums.add(new Album("Lovetap", "Smallpools", R.drawable.ic_dreaming_song_art_web));

        GridView gridView = rootView.findViewById(R.id.ImageGridView);
        gridView.setAdapter(new AlbumAdapter(getContext(),albums));

//        ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);
//        ListView listView = rootView.findViewById(R.id.artist_listView);
//        listView.setAdapter(adapter);
        return rootView;
    }
}
