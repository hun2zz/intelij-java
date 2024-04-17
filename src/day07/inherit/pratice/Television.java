package day07.inherit.pratice;

public class Television extends ElectronicProduct {
    int screenSize;

    Television(String productname, int price, String manufacturer, int screenSize){
        this.productname = productname;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\nScreen Size: %d inches",this.screenSize);
    }
}
