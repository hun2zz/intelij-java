package day02;

import java.util.Arrays;

public class ArrayDelete {

    public static void main(String[] args) {

        //배열에서 원하는 위치의 값 삭제하기
        int[] numbers = {1,3,5,7,9,11};

        int targetIndex = 0; // = 5를 지우고 싶음.

        for (int i = targetIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        int[] temp = new int[numbers.length-1];
        System.arraycopy(numbers, 0, temp, 0, temp.length);
        numbers=temp;
        temp=null;


        System.out.println(Arrays.toString(numbers));

    }
}
