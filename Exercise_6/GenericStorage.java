package Exercise_6;

import java.util.ArrayList;

public class GenericStorage<T extends Person> {
    private ArrayList<T> items;
    private int id;

    public GenericStorage() {
        this.items = new ArrayList<>();
        id = 0;
    }

    public void addItem(T item) {
        id += 1;
        item.setId(id);
        items.add(item);
    }

    public void removeItem(int id) {
        for(T item: items) {
            if(item.getId() == id) {
                items.remove(item);
                break;
            }
        }
    }

    public T searchItem(int id) {
        for(T item: items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    } 

    public void displayAllItems() {
        for(T item: items) {
            System.out.println(item.toString());
        }
    }
}
