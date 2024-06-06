package Leasson5.Inheritenance.ProductProblem;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {
                new Clothing("Clothing Product", 10, 2),
                new Electronics("Electronics Product", 10, 15),
                new Furniture("Furniture Product", 100, 14),
        };
        System.out.println("The total cost is: " + CostSum(products));
    }

    public static double CostSum(Product[] products) {
        double sum = 0;

        for (Product p : products) {
            if (p != null)
                sum += p.getPrice();
        }
        return sum;
    }
}
