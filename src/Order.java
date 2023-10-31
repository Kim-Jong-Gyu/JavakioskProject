import java.util.ArrayList;

public class Order {
    private ArrayList<Product> orderList;
    public Order() {
        this.orderList = new ArrayList<>();
    }

    public void addOrderList(Product product){
        orderList.add(product);
    }

    public ArrayList<Product> getOrderList() {
        return orderList;
    }

    public void clearOrderList(){
        orderList.clear();
    }
}
