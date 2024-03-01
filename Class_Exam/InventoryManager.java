package Class_Exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
   public List<InventoryItem> read() {
    List<InventoryItem> inventoryItems = new ArrayList<>();
    try {
        File file = new File("Class_Exam/task.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine())  != null) {
            String[] array = line.split(",");
            System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
            int ID = Integer.parseInt(array[0].trim());
            String name = array[1].trim();
            int quantity = Integer.valueOf(array[2].trim());
            double price = Double.valueOf(array[3].trim());
            InventoryItem inventoryItem = 
                            new InventoryItem(ID, name, quantity, price);
            
            inventoryItems.add(inventoryItem);
        }
        bufferedReader.close();
    } catch(IOException exception) {
        System.out.println("Warning!");
    }
    return inventoryItems;
   }

   public void write(List<InventoryItem> inventoryItems) {
        try {
            FileWriter filewWriter = new FileWriter(new File("Class_Exam/task.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(filewWriter);
            for(InventoryItem item: inventoryItems) {
                String line = item.getID() + ", " + item.getName() + ", " + item.getQuantity() + ", " + item.getPrice();
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch(IOException exception) {

        }
   }

   public void add(InventoryItem inventoryItem) {
        List<InventoryItem> inventoryItems = read();
        inventoryItems.add(inventoryItem);
        write(inventoryItems);
   }

   public InventoryItem searchById(int ID) {
        List<InventoryItem> inventoryItems = read();
        return inventoryItems.stream()
                            .filter(item -> item.getID() == ID)
                            .findFirst()
                            .orElseThrow();
   }

   public void updateItem(InventoryItem inventoryItem) {
        List<InventoryItem> inventoryItems = read();
        for(int i=0; i<inventoryItems.size(); i++) {
            if(inventoryItems.get(i).getID() == inventoryItem.getID()) {
                inventoryItems.get(i).setName(inventoryItem.getName());
                inventoryItems.get(i).setQuantity(inventoryItem.getQuantity());
                inventoryItems.get(i).setPrice(inventoryItem.getPrice());
            }
        }
        write(inventoryItems);
   }

   public void delete(int ID) {
        List<InventoryItem> inventoryItems = read();
        for(InventoryItem item: inventoryItems) {
            if(item.getID() == ID) {
                inventoryItems.remove(item);
                break;
            }
        }
        write(inventoryItems);
   }

}
