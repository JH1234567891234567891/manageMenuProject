package controller;

import exception.MenuDataException;
import service.MenuDataService;

import java.util.Scanner;

public class DeleteMenuController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("메뉴 삭제를 시작합니다......");
        try {
            MenuDataService.getInstance().isEmpty();
            System.out.print("메뉴 번호를 입력하세요: ");
            int id = sc.nextInt(); sc.nextLine();
            MenuDataService.getInstance().removeMenuData(
                    MenuDataService.getInstance().searchMenuID(id));
            System.out.println("메뉴 삭제 완료");

        } catch (MenuDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
