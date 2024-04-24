package day12.io.obj;

import day12.io.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {

    public static void main(String[] args) {

        List<Snack> snackList = List.of(
                new Snack("콘칲", 1970,1500, Snack.Taste.GOOD),
                new Snack("사브레", 1980, 1200, Snack.Taste.SOSO),
                new Snack("오징어집", 1985, 1800, Snack.Taste.BAD)
        );
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH +
                "/hello/snack.save")){


            //객체를 통째로 저장할 수 있는 보조 스트림
            // serialize: 직렬화 - 데이터를 일렬로 늘여뜨려 놓는 것
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
