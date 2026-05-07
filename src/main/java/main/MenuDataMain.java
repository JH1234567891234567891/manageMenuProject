package main;

import controller.Controller;
import controller.HandlerMapping;
import service.MenuDataService;

import java.util.Scanner;

public class MenuDataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴 관리 시스템을 시작합니다......");

        try {
            while (true){
                System.out.println("|----- 메뉴 관리 프로그램 -----|");
                System.out.println("| 메뉴를 어떻게 관리하시겠습니까?|");
                System.out.println("| 1. 추가 | 2. 삭제 | 3. 수정 |");
                System.out.println("| 4. 전체 메뉴 조회  | 0. 종료 |");
                System.out.print("| 원하시는 번호를 입력하세요 : ");
                int menu = sc.nextInt(); sc.nextLine();

                Controller controller = HandlerMapping.getInstance().createController(menu);
                if(controller != null) controller.execute(sc);
                if(menu==0) {System.out.println("프로그램을 종료합니다......"); break;}

            }

        } finally {
            MenuDataService.getInstance().saveMenuData();
        }

    }
}
