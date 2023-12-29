package CS0045Fall2023;
public class StoreSaleItem {

    private StoreItem storeItem;
    private double price;
    private int quantity;

    // Constructors

    public StoreSaleItem(StoreItem storeItem, double price, int quantity) {
        this.storeItem = storeItem;
        this.price = price;
        this.quantity = quantity;
    }

    public StoreSaleItem() {
        this(new StoreItem(), 0.0, 0);
    }

    // Get methods
    public StoreItem getStoreItem() {
        return storeItem;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set methods
    public void setStoreItem(StoreItem storeItem) {
        this.storeItem = storeItem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method
    @Override
    public String toString() {
        return "StoreSaleItem{" + "storeItem=" + storeItem + ", price=" + price + ", quantity=" + quantity + "}";
    }
}
