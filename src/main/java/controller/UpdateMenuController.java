package controller;

import exception.MenuDataException;
import service.MenuDataService;
import vo.MenuDataVO;

import java.util.Scanner;

public class UpdateMenuController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("메뉴 수정을 시작합니다......");
        try {
            MenuDataService.getInstance().isEmpty();
            System.out.print("메뉴 번호를 입력하세요: ");
            int id = sc.nextInt();
            sc.nextLine();
            MenuDataVO vo = MenuDataService.getInstance().searchMenuID(id);

            System.out.print("메뉴 이름을 입력하세요: ");
            vo.setMenuName(sc.nextLine());
            System.out.print("메뉴 가격을 입력하세요: ");
            vo.setPrice(sc.nextInt());sc.nextLine();
            System.out.println("메뉴 카테고리를 입력하세요");
            System.out.println("1.메인요리, 2.사이드, 3.음료, 4.주류 ,5.디저트");
            vo.setCategory(sc.nextInt());sc.nextLine();
            System.out.println("메뉴 판매여부를 입력하세요(판매중이면 \"1\", 판매중이 아니면 \"0\")");
            vo.setAvailable(MenuDataService.getInstance().isMenuAvailable(sc.nextInt()));sc.nextLine();
        } catch (MenuDataException e) {
            System.out.println(e.getMessage());
            System.out.println("메뉴 수정을 실패하였습니다.");
        }
    }
}
