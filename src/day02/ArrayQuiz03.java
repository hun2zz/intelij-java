package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};


        while(true) {
            System.out.println("- 삭제할 사람의 별명을 입력하세요");
            System.out.print("> ");
            String targetMemberName = sc.nextLine();

            //탐색 알고리즘
            int index = -1;
            for (int i = 0; i < member.length; i++) {
                if (targetMemberName.equals(member[i])) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                System.out.println("- 변경할 별명을 입력하세요");
                System.out.print("> ");
                String targetMemberChange = sc.nextLine();

                member[index] = targetMemberChange;

                System.out.println("변경완료!!");
                System.out.println("* 삭제 후 정보: " + Arrays.toString(member));
                break;
            } else {
                System.out.printf("해당 별명 (%s)은(는) 존재하지 않습니다.%n", targetMemberName);
                continue;
            }
        }
    }
}
