package day09.poly.computer;

public class Desktop {
    //다양성은 객체의 교환성을 높여주며
    //객체가 특성 부품객체에 종속되지 않도록 ㅐㅎ준다.
    Monitor monitor;
    //키보드
    //마우스
    //메인보드
    //...

    public Desktop(Monitor monitor) {
        this.monitor = monitor;
    }

    //모니터를 교체하는 기능

    public void changeMonitor(Monitor monitor){
        this.monitor = monitor;
    }
}
