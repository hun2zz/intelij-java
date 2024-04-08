package day02;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("상품의 가격 :");
        int Price = Integer.parseInt(scan.nextLine());
        System.out.print("상품의 수량 :");
        int sell = Integer.parseInt(scan.nextLine());
        int last = Price * sell;
        System.out.println(last);
    }
}
