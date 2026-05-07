package vo;

import exception.MenuDataException;

import java.util.Objects;

public class MenuDataVO {

    private int menuId;          // 메뉴 번호
    private String menuName;     // 메뉴명
    private int price;           // 가격
    private int category;     // 카테고리(1. 메인요리 2.사이드 3.음료 4.주류 5.디저트)
    private boolean isAvailable; // 판매여부 (true: 판매중, false: 품절)

    public MenuDataVO(int menuId, String menuName, int price, int category, boolean isAvailable) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.price = price;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuDataVO that = (MenuDataVO) o;
        return menuId == that.menuId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(menuId);
    }

    @Override
    public String toString() {
        return menuId +","+ menuName +","+price +","+category +","+isAvailable;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
