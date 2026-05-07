package controller;

import service.MenuDataService;

import java.util.Scanner;

public class PrintAllMenuController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("전체 메뉴를 출력합니다......");
        MenuDataService.getInstance().isEmpty();

        MenuDataService.getInstance().getList().forEach(vo-> System.out.println(vo.toString()));
    }
}
