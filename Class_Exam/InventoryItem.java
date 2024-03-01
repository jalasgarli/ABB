package Class_Exam;

public class InventoryItem {
    private int ID;
    private String name;
    private int quantity;
    private double price;
    public InventoryItem(int ID, String name, int quantity, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
