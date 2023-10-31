import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuContext {
    private final Map<String,ArrayList<Menu>> menuMap;
    private final Map<String, ArrayList<Product>> productsMap;
    public MenuContext() {
        menuMap = new HashMap<>();
        productsMap = new HashMap<>();
        initializeMenuItems();
    }

    // 초기화
    private void initializeMenuItems(){
        ArrayList<Menu> menuArrayList= new ArrayList<>();
        menuArrayList.add(new Menu(1, "Burgers", "빅맥®에서 맥스파이시® 상하이버거까지,주문 즉시 바로 조리해 더욱 맛있는, 맥도날드의 다양한 버거를 소개합니다."));
        menuArrayList.add(new Menu(2, "Sides", "가볍게 즐겨도, 버거와 함께 푸짐하게 즐겨도, 언제나 맛있는 사이드와 디저트 메뉴!"));
        menuArrayList.add(new Menu(3, "Drinks", "언제나 즐겁게, 맥카페와 다양한 음료를 부담없이 즐기세요!"));
        menuArrayList.add(new Menu(4, "HappyMeal", "맛과 즐거움 모두 해피밀을 통해 느껴보세요!"));
        ArrayList<Menu> orderArrayList = new ArrayList<>();
        orderArrayList.add(new Menu(5, "Order", "장바구니를 확인 후 주문합니다"));
        orderArrayList.add(new Menu(6, "Cancel", "진행중인 주문을 취소합니다."));
        menuMap.put("Mcdonalds MENU",menuArrayList);
        menuMap.put("ORDER MENU",orderArrayList);

        ArrayList<Product> burgersArrayList = new ArrayList<>();
        burgersArrayList.add(new Product(1, "McCrispy Deluxe Burger",
                "100% 통닭다리살 겉바속촉 케이준 치킨 패티, 촉촉한 포테이토 브리오쉬 번, 스페셜 스모키 소스가 선사하는 놀랍도록 새로운 맛의 치킨 버거!",
                7.6));
        burgersArrayList.add(new Product(2, "Big Mac",
                "100% 순 쇠고기 패티 두 장에 빅맥®만의 특별한 소스. 입안에서 살살 녹는 치즈와 신선한 양상추, 양파, 그리고 피클까지. 50년 넘게 전 세계인의 입맛을 사로 잡은 버거의 대명사",
                6.0));
        burgersArrayList.add(new Product(3, "1955 Burger",
                "113g 두툼한 순 쇠고기 패티, 특별한 1955 소스에 깊은 풍미의 그릴드 어니언까지! 맥도날드가 처음 생긴 1955년의 맛을 담은 영원한 오리지널 1955 버거",
                7.2));
        burgersArrayList.add(new Product(4, "Bacon Tomato Deluxe",
                "두 장의 100% 순 쇠고기 패티에 그릴에 구워 더욱 고소한 1장의 베이컨을 얹고, 신선한 토마토와 양상추, 매콤달콤한 스위트 칠리 소스, 치즈, 마요네즈를 더해 더욱 풍부하고 신선한 맛의 프리미엄 버거",
                6.6));

        ArrayList<Product> sidesArrayList = new ArrayList<>();
        sidesArrayList.add(new Product(1, "Sausage Snack Wrap",
                "육즙 가득 든든한 소시지에 짭조롬한 베이컨까지! 소시지 스낵랩",
                3.9));
        sidesArrayList.add(new Product(2, "Coleslaw",
                "양배추, 당근, 양파가 상큼하고 크리미한 마요 드레싱과 어우러져 아삭하게 씹히는 샐러드",
                2.7));
        sidesArrayList.add(new Product(3, "French Fries",
                "통으로 썰어낸 감자를 맥도날드만의 노하우로 튀겨낸 남다른 맛과 바삭함! 맥도날드의 역사가 담긴 월드 클래스 후렌치 후라이",
                2.8));
        sidesArrayList.add(new Product(4, "McNuggets 4 pieces",
                "바삭하고 촉촉한 치킨이 한 입에 쏙! 다양한 소스로 입맛에 맞게 즐겨보세요!",
                3.3));

        ArrayList<Product> drinksArrayList = new ArrayList<>();
        drinksArrayList.add(new Product(1,"Plum Peach Chiller",
                "상콤한 자두와 달콤한 천도복숭아의 만남! 자두 천도복숭아 칠러",
                3.7));
        drinksArrayList.add(new Product(2,"Vanilla Latte",
                "바로 내린 100% 친환경 커피의 진한 맛과 향,1A등급 우유, 그리고 천연 바닐라 향으로 달콤함까지!",
                4.5));
        drinksArrayList.add(new Product(3,"Café Latte",
                "바로 내린 100% 친환경 커피가 신선한 우유를 만나 더 신선하고 부드럽게",
                4.0));
        drinksArrayList.add(new Product(4,"Americano",
                "바로 내린 100% 친환경 커피로 더 신선하게! 더 풍부하게!",
                3.3));

        ArrayList<Product> happyMealArrayList = new ArrayList<>();
        happyMealArrayList.add(new Product(1, "Egg McMuffin",
                "캐나디안 스타일 베이컨과 계란의 클래식한 만남, 맥도날드의 아침을 탄생하게 한 바로 그 메뉴",
                3.8));
        happyMealArrayList.add(new Product(2, "Hotcakes 2pcs",
                "부드럽게 구워낸 핫케이크에 향긋한 버터와 달콤한 시럽을 살며시 부어 오늘 하루도 기분 좋게 시작하세요",
                3.6));
        happyMealArrayList.add(new Product(3, "Hash Brown",
                "씹으면 바삭바삭, 속은 부드러운 감자의 고소함",
                2.1));

        productsMap.put("Burgers", burgersArrayList);
        productsMap.put("Sides", sidesArrayList);
        productsMap.put("Drinks", drinksArrayList);
        productsMap.put("HappyMeal", happyMealArrayList);
    }
    public void showOptionMenu(){
        headMenu();
        optionMenu();
    }

    public void showProductMenu(String product){
        headMenu();
        System.out.println("[ " + product + " ]");
        for(Product value : productsMap.get(product)){
            System.out.println(makeProductFormat(value.getMenuId(),value.getMenuName(), value.getMenuDesc(), value.getPrice()));
        }
    }

    public Product selectProduct(String productCat, String productName){
        for(Product select : productsMap.get(productCat)){
            if(select.getMenuName().equals(productName)){
                return select;
            }
        }
        return null;
    }

    public void showSelectProduct(String productCat, String productName){
        for(Product select : productsMap.get(productCat)){
            if(select.getMenuName().equals(productName)){
                System.out.println(makeProductFormat(select.getMenuName(),select.getMenuDesc(),select.getPrice()));
            }
        }
    }

    public void showAddMessage(String productName){
        System.out.println(productName + " 이 장바구니에 추가되었습니다.");
        System.out.println();
    }

    public void showSelectMessage(){
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }

    private String makeProductFormat(int productId, String name, String desc, double price){
        String changName = String.format("%-25s", name);
        return productId +". "+ changName + "| W " + price + " | " + desc;
    }

    private String makeProductFormat(String name, String desc, double price){
        String changName = String.format("%-25s", name);
        return changName + "| W " + price + " | " + desc;
    }

    private void headMenu(){
        System.out.println("Mcdonalds 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
    }

    private void optionMenu() {
        for(String key : menuMap.keySet()){
            System.out.println("[ " + key + " ]");
            for(Menu value : menuMap.get(key)){
                System.out.println(makeOptionFormat(value.getMenuId(), value.getMenuName(), value.getMenuDesc()));
            }
            if(key.equals("ORDER MENU"))
                continue;
            System.out.println();
        };
    }

    private String makeOptionFormat(int menuId, String name, String desc) {
        String changName = String.format("%-25s", name);
        return menuId +". "+ changName + "| " + desc;
    }
}
