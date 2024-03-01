public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Iphone");
        System.out.println("Product ID: " + product.productID);
        System.out.println("Product Name: " + product.productName);
        System.out.println("Company Name: " + product.companyName);
        Product product2 = new Product("Iphone");
        System.out.println("Product ID: " + product2.productID);
        System.out.println("Product Name: " + product2.productName);
        System.out.println("Company Name: " + product2.companyName);
    }
}
