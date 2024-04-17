package day07.encap.practice;

public class Car {

    private String Brand;
    private String Model;
    private int Year;

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }
}
