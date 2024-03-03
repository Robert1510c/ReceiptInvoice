public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Clean Code, Robert C. Martin", 100, 8);
        Product p2 = new Product("Applying UML and Patterns, C. Larman", 300, 8);
        Product p3 = new Product("Shipping", 50, 23);

        ReceiptInvoice printer = new ReceiptInvoice();
        printer.addProduct(p1);
        printer.addProduct(p2);
        printer.addProduct(p3);
        printer.print();
    }
    
}
