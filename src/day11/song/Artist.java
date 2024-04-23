package day11.song;

import java.util.Set;

//1개의 가수 정보
public class Artist {
    private String artistName; // 가수명
    private Set<String> songlist; // 노래 목록


    //생성자
    // 0

    public Artist(String artistName, Set<String> songlist) {
        this.artistName = artistName;
        this.songlist = songlist;
    }

    public Artist() {

    }

    @Override
    public String toString() {
        return "Artist{" +
                "songlist=" + songlist +
                ", artistName='" + artistName + '\'' +
                '}';
    }

    public String getArtistName() {
        return artistName;
    }

    public Set<String> getSonglist() {
        return songlist;
    }

    //setter, getter



}
