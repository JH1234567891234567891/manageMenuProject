package service;

import vo.MenuDataVO;

import java.io.*;
import java.util.ArrayList;

public class MenuDataService {
    private static MenuDataService instance = new MenuDataService();

    private ArrayList<MenuDataVO> list;

    private MenuDataService(){
        list = new ArrayList<MenuDataVO>();

        //데이터 로드
        loadMenuData();
    }

    private void loadMenuData() {
        try (FileReader fr = new FileReader("menu.csv");
             BufferedReader br = new BufferedReader(fr);) {
            br.readLine();
            while (true){
                String str = br.readLine();
                if(str == null) break;
//                System.out.println(str);
                String[] arr = str.split(",");
                list.add(new MenuDataVO(Integer.parseInt(arr[0]), arr[1],
                        Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Boolean.parseBoolean(arr[4])));
            }
            System.out.println("메뉴 정보 로드 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static MenuDataService getInstance() {
        if(instance == null) instance = new MenuDataService();
        return instance;
    }


    public void saveMenuData() {
        try (FileWriter fw = new FileWriter("menu.csv");
            PrintWriter pw = new PrintWriter(fw)){

            pw.println("id,name,price,category,isAvailable");
            list.forEach(t-> pw.println(t.toString()));
            System.out.println("메뉴 정보 세이브 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
