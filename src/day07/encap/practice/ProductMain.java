package day07.encap.practice;

public class ProductMain {

    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200000);
        product.setStock(30);
        System.out.println("상품명: " + product.getName());
        System.out.println("상품 가격: " + product.getPrice());
        System.out.println("재고 수량: " + product.getStock());
        product.reduceStock(5);
        System.out.println("판매 후 수량: " + product.getStock());
    }
}
