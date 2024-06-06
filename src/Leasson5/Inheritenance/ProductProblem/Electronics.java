package Leasson5.Inheritenance.ProductProblem;

public class Electronics extends Product {
    private int warrantyInMonths;
    private double warrantyCost;

    public Electronics(String productName, double price, double warrantyCost) {
        super(productName, price);
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }
}
