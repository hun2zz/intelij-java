package day11.api.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        // 자바 8 이전
        Date date = new Date();
        System.out.println("date = " + date.getYear());


        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);

        //자바 8 이후
        LocalTime nowDate = LocalTime.now();
        System.out.println("nowTime = " + nowDate);

        LocalDate localDate = LocalDate.of(2022, 4, 6);
        System.out.println("localDate = " + localDate);

        //날짜 연산
        //도서 대여 시스템에서 빌린 날짜로부터 3일 뒤가 반납일
        LocalDate rentalDAte = LocalDate.now();
        LocalDate localDate1 = rentalDAte.plusDays(3);
        System.out.println("localDate1 = " + localDate1);

        //사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022,12,27);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        //날짜 포맷 바꾸기
//        System.out.println("between = " + nowDate);
//        DateTimeFormatter patt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
//        String format = nowDate.format(patt);
//
//        System.out.println("format = " + format);
    }
}
