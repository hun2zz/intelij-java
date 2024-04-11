package day02;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {


        int[] numbers = {10,20,30,40, 50, 60};


        //pop : 배열의 맨 끝 데이터를 삭제하면서 꺼내오기

        //1. 기존 사이즈보다 1개 적은 사이즈의 배열을 생성
        int[] temp = new int[numbers.length-1];

        //2. 원본 배열에서 맨 끝 인덱스를 제외한 모든 내용 사본에 복사
        System.arraycopy(numbers, 0, temp, 0, temp.length);
        //3. 삭제 값 백업
        int removeNumber = numbers[numbers.length -1];

        numbers=temp;
        temp=null;
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("temp = " + Arrays.toString(temp));
        System.out.println("삭제 값 = " + removeNumber);
    }
}
