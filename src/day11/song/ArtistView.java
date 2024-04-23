package day11.song;


import util.SimpleInput;

import javax.naming.PartialResultException;
import java.util.HashSet;
import java.util.Set;

//프로그램 입출력
public class ArtistView {
    private static ArtistRepository repository;
    private static Artist ar;
    ArtistRepository artistRepository = new ArtistRepository();
    HashSet<String> songlist = new HashSet<>();
    //프로그램 실행

    private void createSong() {
        System.out.println("# 노래 등록을 시작합니다");
        String artist = SimpleInput.input("- 가수명 ");
        String song = SimpleInput.input("- 노래명 ");
        songlist.add(song);
        artistRepository.pushArtist(artist, new Artist(artist, songlist));
        System.out.printf("#%s 님이 신규 등록되었습니다.", artist);
    }

    private static void showMenu() {
        System.out.println("****** 음악 관리 프로그램 ******");
//        System.out.printf("# 현재 등록된 가수: %d명", );
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("============================");
    }

    private void showArtist() {
        String artist = SimpleInput.input("- 찾으실 가수명 ");
        int count = 0;
        Artist artist1 = artistRepository.getArtist(artist);
        System.out.printf("%s 님의 재생 목록\n", artist1.getArtistName());
        System.out.println("===========================");
        for (String s : songlist) {
            System.out.printf("* %d. %s\n®", count, s);
            count++;

        }
    }

    public void start() {
        while (true) {
            showMenu();
            String menuNum = SimpleInput.input(" >>> ");
            switch (menuNum) {
                case "1":
                    createSong();
                    break;
                case "2":
                    showArtist();
                    break;
                case "3":
                    System.out.println("# 프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("올바르게 입력해라.");
            }
        }
    }


}
