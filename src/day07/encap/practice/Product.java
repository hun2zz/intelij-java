package day07.encap.practice;

public class Product {

    private String Name;
    private int Price;
    private int Stock;

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public int getStock() {
        return Stock;
    }

    public void reduceStock(int n){
        this.Stock -= n;
    }
}
