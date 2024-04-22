package day10.inter.prac;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("미디어가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("미디어가 멈춥니다.");
    }

    @Override
    public void stop() {
        System.out.println("미디어가 종료됩니다..");
    }
}
