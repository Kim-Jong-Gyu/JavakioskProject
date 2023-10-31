public class Product extends Menu{
    double price;

    public Product(int menuId, String menu, String MenuDesc, double price) {
        super(menuId, menu, MenuDesc);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
