import java.util.Scanner;

public class App {

    MenuContext menuContext;
    OrderContext orderContext;

    Scanner sc;

    public App() {
        menuContext = new MenuContext();
        orderContext = new OrderContext();
        sc = new Scanner(System.in);
    }

    public void run() throws InterruptedException {
        menuContext.showOptionMenu();
        String selectMenu = sc.nextLine();
        switch (selectMenu){
            case "Order" : selectOrder(selectMenu);
                break;
            case "Cancel" : selectCancel(selectMenu);
                break;
            default: selectProduct(selectMenu);
        }
    }


    private void selectProduct(String productCat){
        menuContext.showProductMenu(productCat);
        String selectProduct = sc.nextLine();
        menuContext.showSelectProduct(productCat,selectProduct);
        menuContext.showSelectMessage();
        String addProduct = sc.nextLine();
        if (!addProduct.equals("확인")) return;

        orderContext.addUserOrderList(menuContext.selectProduct(productCat,selectProduct));
        menuContext.showAddMessage(selectProduct);
    }

    private void selectOrder(String menu) throws InterruptedException {
        orderContext.showOrderPage(menu);
        String orderFlag = sc.nextLine();
        if(orderFlag.equals("주문")){
            orderContext.showCompleteOrder();
            orderContext.timer();
        }
    }

    private void selectCancel(String menu) {
        orderContext.showCancelPage();
        String cancelFlag = sc.nextLine();
        if(cancelFlag.equals("확인")){
            orderContext.removeOrderList();
        }
    }
}
