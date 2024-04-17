package day07.inherit.pratice;

public class Smartphone extends ElectronicProduct{
    int storageCapacity;

    Smartphone(String productname, int price, String manufacturer, int storageCapacity){
        this.productname = productname;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\n저장 용량: %d GB",this.storageCapacity);
    }

}
