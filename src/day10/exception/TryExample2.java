package day10.exception;

import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수 1: ");
            int n1 = Integer.parseInt(sc.next()); // NumberFormatException


            System.out.print("정수 2: ");
            int n2 = sc.nextInt(); //InputMismatchException


            int result = n1 / n2; // AristhmeticException
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("정수를 입력하라고요");
        }

        System.out.println("프로그램 정상 종료");


    }
}
