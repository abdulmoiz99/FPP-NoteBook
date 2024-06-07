package Leasson5.InnerClass.SortWithMemeberClass;

public class OuterClass {
    private int data = 10;

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printVal(20);
    }

    void printVal(int bond) {
        if (data < bond) {
            class Inner {
                public int getValue() {
                    return data;
                }
            }
            Inner inner = new Inner();
            System.out.println("Inside" + inner.getValue());
        } else {
            System.out.println("outside");
        }
    }
}
