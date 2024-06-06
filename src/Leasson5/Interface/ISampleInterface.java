package Leasson5.Interface;

public interface ISampleInterface {
    public double value = 1;

    double computeArea();

    default double computeDouble() {
        return 0;
    }
}
