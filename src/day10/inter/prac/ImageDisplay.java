package day10.inter.prac;

public class ImageDisplay implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 멈춥니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지를 종료시킵니다.");
    }
}
