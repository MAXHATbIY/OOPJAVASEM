package Seminar;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Twix", 100);
        Product bottle = new Bottle("aqva", 75, 1.5);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(bottle);

        System.out.println(bottle);
    }
}
