package day10.inter.prac;

public class VideoPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("비디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("비디오가 멈춥니다.");
    }

    @Override
    public void stop() {
        System.out.println("비디오가 종료됩니다.");
    }
}
