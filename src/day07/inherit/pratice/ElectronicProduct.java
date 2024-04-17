package day07.inherit.pratice;

public class ElectronicProduct {
    String productname;
    int price;
    String manufacturer;

    public void displayInfo(){
        System.out.printf("%s, 가격 : %d, 제조사 : %s",this.productname,this.price,this.manufacturer);
    }
}
