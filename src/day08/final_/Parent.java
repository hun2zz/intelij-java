package day08.final_;


class Child extends Parent {
//    @Override
//    void sing() {
//        System.out.println("비비크림 빠빠빠");
//    }

    @Override
    void dance() {
        System.out.println("춤을 핑팡퐁");
    }
}
public class Parent {
   final void sing(){
        System.out.println("노래를 랄랄라");
    }
    void dance(){
        System.out.println("댄스를 하하호호");
    }
}
