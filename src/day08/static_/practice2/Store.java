package day08.static_.practice2;

public class Store {
    static int totalSales;


    static void addSale(int amount){
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
