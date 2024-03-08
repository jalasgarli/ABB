package Class_Exam.Class_Exam;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, FileIOException  {
        InventoryManager inventoryManager = new InventoryManager();
        //System.out.println(inventoryManager.read());
        System.out.println("------------------------------------------");
        InventoryItem inventoryItem = new InventoryItem(3, "water",1, 0.8);
        inventoryManager.add(inventoryItem);
        //System.out.println(inventoryManager.read());
        System.out.println("------------------------------------------");
        //InventoryItem inventoryItem1 = new InventoryItem(1, "phone",3, 0.3);
        //inventoryManager.updateItem(inventoryItem1);
        System.out.println(inventoryManager.read());
        inventoryManager.delete(1);



    }
}
