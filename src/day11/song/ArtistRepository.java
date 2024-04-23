package day11.song;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArtistRepository {
    private Map<String, Artist> artistMap;


    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    // 새로운 가수 정보 추가
    public void pushArtist(String artistName, Artist artist) {
        artistMap.put(artistName, artist);
    }

    // 가수 정보 조회
    public Artist getArtist(String artistName) {
        return artistMap.get(artistName);
    }

    // 가수 정보 삭제
    public void deleteArtist(String artistName) {
        artistMap.remove(artistName);
    }


    // 가수 정보 수정
    // 필요에 따라 추가 구현 가능
}
