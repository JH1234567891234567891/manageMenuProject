package vo;

public class MenuDataVO {
    private int menuId;          // 메뉴 번호
    private String menuName;     // 메뉴명
    private int price;           // 가격
    private String category;     // 카테고리
    private boolean isAvailable; // 판매여부 (true: 판매중, false: 품절/숨김)
}
