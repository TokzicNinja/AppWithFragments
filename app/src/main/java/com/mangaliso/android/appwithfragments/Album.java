package com.mangaliso.android.appwithfragments;

public class Album
{
    private String albumName;
    private String artistName;
    private int mResId;

    Album(String albumName, String artistName)
    {
        this.albumName = albumName;
        this.artistName = artistName;
    }

    Album(String albumName, String artistName, int mResId)
    {
        this.albumName = albumName;
        this.artistName = artistName;
        this.mResId = mResId;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public void setArtistName(String artistName)
    {
        this.artistName = artistName;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public int getResId()
    {
        return mResId;
    }

    public void setResId(int mResId)
    {
        this.mResId = mResId;
    }

    public void setTitle(String albumName)
    {
        this.albumName = albumName;
    }
}