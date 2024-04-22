package day10.inter.prac;

import book.Book;

import java.util.Arrays;

class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
//        MEdiaPlayable[] temp = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사
            MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
            for (int i = 0; i < mediaList.length; i++) {
                temp[i] = mediaList[i];
            }
            temp[temp.length - 1] = media;
            mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }
}