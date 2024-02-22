package Class_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // FunctionalInterface<String, Integer> result = (String a, Integer b) -> {
        //     System.out.println((Integer.parseInt(a) + b));
        // };

        // result.Calculate("2", 2);

        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 

        Predicate<Product> predicate = (product) -> {
            return product.price == 30000;
        };

        productsList.stream()
                    .filter(predicate)
                    .forEach(product -> System.out.println(product.name));

        float totalPrice = productsList.stream()
                                        .map(product -> product.price)
                                        .reduce(0.0f,(sum, price)->sum+price);
        
        System.out.println(totalPrice);

        double totalPrice1 = productsList.stream().collect(Collectors.summingDouble(product->product.price));  

        System.out.println(totalPrice1);
    }
}
