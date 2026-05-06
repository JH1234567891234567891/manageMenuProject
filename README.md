# Menu Project


간단한 메뉴 관리 프로그램
- 관리되는 메뉴는 **메뉴 번호**, **메뉴명**, **가격**, **카테고리**, **판매여부**  
- 메뉴 데이터 관리 기능은 **메뉴 추가**, **삭제**, **수정**, **전체 출력**
## 프로젝트 구조
```
controller
  |
  ├ Controller
  ├ HandlerMapping
  | ...
  |
main
  ├ MenuDataMain
service
  ├ MenuDataService
exception
  ├ MenuDataException
 vo
  └ MenuDataVO
```
---

### controller
- 사용자 요청 처리
- Controller
- HandlerMapping
- AppendMenuController
- DeleteMenuController
- UpdateMenuController
- PrintAllMenuController

### vo
- 메뉴 데이터 객체
- **메뉴 번호**, **메뉴명**, **가격**, **카테고리**, **판매여부(true/false)**
- 카테고리 : 
  - 1.메인요리  
  - 2.사이드
  - 3.음료
  - 4.주류, 
  - 5.디저트

### service
- 메뉴 추가, 삭제 수정, 조회 로직 처리
- 데이터 저장 및 불러오기

### exception
- 프로그램을 실행하며 생기는 문제들 처리

### main
- 프로그램 실행 및 메뉴 선택 흐름 관리
- 프로그램 종료시 자동 데이터 저장

