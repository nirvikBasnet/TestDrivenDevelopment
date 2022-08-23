package ShoppingBasket;

public class Item {

    private final double unitPrice;
    private final int quantity;


    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getItemQuantity(){
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getSubTotal() {
        return getUnitPrice() * getItemQuantity();
    }
}
