package book;

import day06.member.MemberView;
import util.SimpleInput;

public class BookController {
    LibraryView mv;
    SimpleInput si;

    BookController() {
        this.mv = new LibraryView();
        this.si = new SimpleInput();
    }

    void run() {
        mv.setMemberInfo();
        while (true) {
            String menuNum = mv.libraryMenu();
            switch (menuNum) {
                case "1":
                    mv.myInfoMenu();
                    break;
                case "2":
                    mv.showMembers();
                    break;
                case "3":
                    mv.searchBook();
                    break;
                case "4":
                    mv.borrowBook();
                    break;
                case "5":
                    mv.searchAuthor();
                    break;
//                case "6":
//                    mv.deleteValueinsert();
//                    break;
                case "9":
                    boolean flag = mv.exitProgram();
                    if (flag) return;
            }
            si.stopInput();
        }
    }
}
