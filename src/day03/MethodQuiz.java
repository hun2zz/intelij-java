package day03;

import java.util.Arrays;

public class MethodQuiz {



    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }
    static void push(String... newFoods) {
        //배열 temp에 복사하기.
        String[] temp = new String[foods.length + 1];
//        for문으로 값도 복사해주기.
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFoods[0];
        foods = temp;
        temp = null;
    }
    static int indexOf(String n1){
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (n1.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void remove(String n1) {
        if (indexOf(n1) != -1) {
            // 삭제 알고리즘
            for (int i = indexOf(n1); i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }

            String[] temp = new String[foods.length - 1];

            for (int i = 0; i < foods.length - 1; i++) {
                temp[i] = foods[i];
            }

            foods = temp;
            temp = null;
        } else {
            System.out.printf("존재하지 않음");
        }
    }
    static boolean include(String... n1) {
        if (indexOf(n1[0]) != -1) {
            return true;
        } else {
            return  false;
        }
    }

    static void insert(int n1, String n2){
            String[] temp = new String[foods.length + 1];
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];

            }
            for (int i = foods.length; i > n1; i--) {
                temp[i] = temp[i-1];
            }

            //4. 새로운 데이터를 타겟 인덱스자리에 복사
            temp[n1] = n2;

            //5 주소값 이전
            foods = temp; temp = null;
    }

    static void modify(int n1, String n2) {
        foods[n1] = n2;
    }
    public static void main(String[] args) {


        printFoods();
        push("라면");
        push("라면땅");
        printFoods();
//
        int index = indexOf("파스타");
        System.out.println("index = " + index);
//
        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);
//
        remove("라면땅");
        printFoods();
//
//
        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);
//
        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);
//
        insert(1, "파인애플");
//
        printFoods();
//
        modify(2, "닭갈비");
        printFoods();


    }
}
