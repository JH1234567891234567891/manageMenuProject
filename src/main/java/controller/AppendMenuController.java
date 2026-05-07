package controller;

import exception.MenuDataException;
import service.MenuDataService;
import vo.MenuDataVO;

import java.util.Scanner;

public class AppendMenuController implements Controller {
    @Override
    public void execute(Scanner sc) {
            System.out.println("메뉴 추가를 시작합니다......");
            System.out.print("메뉴 번호를 입력하세요: ");
            int id = sc.nextInt(); sc.nextLine();
            //중복체크
        try {
            MenuDataService.getInstance().isDuplicateMenu(id);

            System.out.print("메뉴 이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("메뉴 가격을 입력하세요: ");
            int price = sc.nextInt(); sc.nextLine();
            System.out.println("메뉴 카테고리를 입력하세요");
            System.out.println("1.메인요리, 2.사이드, 3.음료, 4.주류 ,5.디저트");
            int category = sc.nextInt(); sc.nextLine();
            MenuDataService.getInstance().selectCategory(category);
            System.out.println("메뉴 판매여부를 입력하세요(판매중이면 \"1\", 판매중이 아니면 \"0\")");
            int isAvailable = sc.nextInt(); sc.nextLine();


            MenuDataVO vo = new MenuDataVO(id,name,price,category
                    ,MenuDataService.getInstance().isMenuAvailable(isAvailable));

            boolean flag = MenuDataService.getInstance().addMenuData(vo);
            System.out.println(flag ? "메뉴 추가 성공" : "메뉴 추가 실패");
        } catch (MenuDataException e) {
            System.out.println(e.getMessage());
        }

        }
}
