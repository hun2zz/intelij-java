package day07.inherit;

public class Computer extends Calculator{

    @Override
    public Double clcAreaCircle(int r) {
        return r * r * Math.PI;
    }
}
