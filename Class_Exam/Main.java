package Class_Exam;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        System.out.println(inventoryManager.read());
        InventoryItem inventoryItem = new InventoryItem(1, "water",1, 0.8);
        inventoryManager.add(inventoryItem);
        System.out.println("------------------------------------------");
        System.out.println(inventoryManager.read());
    }
}
