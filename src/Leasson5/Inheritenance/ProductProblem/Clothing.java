package Leasson5.Inheritenance.ProductProblem;

public class Clothing extends Product {
    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, double discountPercentage) {
        super(productName, price);
        this.discountPercentage = discountPercentage;
    }


    @Override
    public double getPrice() {
        return super.getPrice() - discountPercentage;
    }
}
