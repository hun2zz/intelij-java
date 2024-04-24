package day12.io;

import java.io.File;
import java.io.IOException;

public class FileExample {


    public static final String ROOT_PATH="/Users/jinsanghun/Desktop";
    public static void main(String[] args) {

        //폴더 생성 명령
        // 파일 정보 객체 생성
        File file = new File(ROOT_PATH + "/hello");

        //폴더 생성
        if (!file.exists()) file.mkdir();

        //파일 생성하기
        File newFile = new File(ROOT_PATH + "/hello/food.txt");
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성에 실패했습니다.");
            }
        }


    }
}
