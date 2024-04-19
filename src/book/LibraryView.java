package book;

import day03.member.Gender;
import day06.member.Member;
import util.SimpleInput;

import java.util.Arrays;


public class LibraryView {
    BookUser lr;
    SimpleInput si;
    LibraryRepository lrb;
    Book br;
    private Gender gender;
    CookBook ck;
    CartoonBook cb;


    LibraryView() {
        this.lr = new BookUser();
        this.si = new SimpleInput();
        this.lrb = new LibraryRepository();
        this.ck = new CookBook();
        this.cb = new CartoonBook();
    }

    void setMemberInfo() {
        System.out.println("\n##### 회원 정보를 입력해주세요. #####");
        String no = si.input("# 이름 : ");
        lr.setName(no);
        String age = si.input("# 나이 : ");
        lr.setAge(Integer.parseInt(age));
//        System.out.println(lr.getAge());
        String fe = si.input("# 성별(M/F) : ");
        if (fe.equals("F")) {
            this.gender = Gender.FEMALE;
        } else if (fe.equals("M")) {
            this.gender = Gender.MALE;
        } else {
            System.out.println("#성별을 잘못 입력했습니다.");
            System.out.println("=============================");
        }
        System.out.println();
    }

    String libraryMenu() {
        System.out.println("\n##### 도서메뉴 #####");
        System.out.println("\n1. 마이페이지");
        System.out.println("\n2. 도서 전체 조회");
        System.out.println("\n3. 도서 제목으로 검색");
        System.out.println("\n4. 도서 대여하기");
        System.out.println("\n5. 도서 저자이름으로 검색");
        System.out.println("\n9. 프로그램 종료하기");
        String menuNumber = si.input("- 메뉴 번호: ");
        return menuNumber;
    }

    void myInfoMenu() {
        System.out.println("#회원명 : " + lr.getName());
        System.out.println("#나이 : " + lr.getAge());
        System.out.println("#성별 : " + lr.getGenderToString());
        System.out.println("#쿠폰개수 : " + lr.getCouponCount());
    }

    void showMembers() {
        System.out.printf("========= 모든 도서 ==========\n");
        for (Book m : lrb.bookList.getMembers()) {
            System.out.println(m.info());
        }

    }

    void searchBook() {
        String no = si.input("# 검색어 : ");
        boolean isBoolean = false;
        for (Book m : lrb.bookList.getMembers()) {
            if (m.getTitle().contains(no)) {
                isBoolean = true;
                System.out.println(m.info());
            }
        }
        if (!isBoolean) {
            System.out.println("없습니다!!");
        }
    }

    void borrowBook() {
        int q = 1;
        for (Book m : lrb.bookList.getMembers()) {
            System.out.printf("%d. %s\n", q, m.info());
            q++;
        }
        String bb = si.input("-대여할 도서 번호 입력 : ");
        int bookNumber = Integer.parseInt(bb);
        Book selecBook = lrb.bookList.getMembers()[bookNumber - 1];
        if (selecBook instanceof CartoonBook){
            if(lr.getAge() > ((CartoonBook) selecBook).getAccessAge()) {
                System.out.println("# 도서 대여에 성공하였습니다.");
            } else {
                System.out.println("꺼지쇼");
            }
        }
        if(selecBook instanceof CookBook){
            if(((CookBook) selecBook).isCoupon()) {
                System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다");
                lr.setCouponCount(lr.getCouponCount() + 1);
            } else {
                System.out.println("ㄷ여 성공");
            }

        }





    }
    void searchAuthor() {
        String nos = si.input("# 검색어 : ");
        boolean isBoolean1 = false;
        for (Book m : lrb.bookList.getMembers()) {
            if (m.getAuthor().contains(nos)) {
                isBoolean1 = true;
                System.out.println(m.info());
            }
        }
        if (!isBoolean1) {
            System.out.println("없습니다!!");
        }
    }
    boolean exitProgram() {
        String exit = si.input("- 프로그램을 종료합니까? [y/n]\n>> ");
        if (exit.equals("y")) {
            System.out.println("프로그램을 종료합니다!");
            return true;
        }
        else {
            System.out.println("프로그램 종료를 취소합니다.");
            return false;
        }
    }
}