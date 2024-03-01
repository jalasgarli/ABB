class Product {
    static String companyName;
    int productID;
    String productName;

    static {
        companyName = "MyCompany";
    }

    {
        productID = 1000;
        productID += 1;
    }

    Product(String productName) {
        this.productName = productName;
    }
}
