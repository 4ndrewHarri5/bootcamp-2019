package com.manchesterDigital;

import java.util.List;

public class Album {

    private final String albumName;
    private final List<Song> allSongs;

    public Album(String albumName, List<Song> allSongs) {
        this.albumName = albumName;
        this.allSongs = allSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<Song> getAllSongs() {
        return allSongs;
    }
}
