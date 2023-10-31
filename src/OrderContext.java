import java.util.HashMap;
import java.util.Map;

public class OrderContext {
    // 대기 번호와 주문 리스트
    private Map<Integer, Order> userOrderList;

    private int watingNum = 0;

    private double totalPrice;

    public OrderContext() {
        userOrderList = new HashMap<>();
        Order order = new Order();
        // 대기번호 해결 할 방법을 찾아야 한다.
        userOrderList.put(watingNum, order);
    }

    public void addUserOrderList(Product product) {
        userOrderList.get(watingNum).addOrderList(product);
    }

    public void showOrderPage(String menu) {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        showUserOrderList(menu);
        System.out.println();
        showTotalPrice();
        System.out.println();
        showOrderMessage();
    }

    public void showCompleteOrder() {
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        System.out.println("대기 번호는 [ " + watingNum + " ] 번 입니다.");
    }

    public void timer() throws InterruptedException {
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        Thread.sleep(3000);
    }

    public void showCancelPage(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
    }

    public void removeOrderList(){
        userOrderList.get(watingNum).clearOrderList();
    }

    private void showUserOrderList(String menu) {
        // waitingNum 처리 방법 생각해야한다.
        System.out.println("[ " + menu + " ]");
        for (Product product : userOrderList.get(0).getOrderList()) {
            totalPrice += product.getPrice();
            System.out.println(makeProductFormat(product.getMenuName(), product.getMenuDesc(), product.getPrice()));
        }
    }

    private void showTotalPrice() {
        System.out.println("[ Total ]");
        System.out.println("W " + totalPrice);
    }

    private void showOrderMessage() {
        System.out.println("1. 주문      2. 메뉴판");
    }

    private String makeProductFormat(String name, String desc, double price) {
        String changName = String.format("%-25s", name);
        return changName + "| W " + price + " | " + desc;
    }
}
