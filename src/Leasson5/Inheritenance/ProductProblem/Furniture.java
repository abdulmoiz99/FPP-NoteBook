package Leasson5.Inheritenance.ProductProblem;

public class Furniture extends Product {
    private String material;
    private double shippingCost;

    public Furniture(String productName, double price, double shippingCost) {
        super(productName, price);
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }
}
