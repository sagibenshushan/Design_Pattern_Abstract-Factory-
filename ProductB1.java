package Q3;

public class ProductB1 extends AbstractProductB {
    ProductB1(String arg) {
        System.out.println("Hello " + arg);
    }
    @Override
    public void operationBOP1() {
        System.out.println("ProductB1 in operationBOP1()");
    }
    @Override
    public void operationBOP2() {
        System.out.println("ProductB1 in operationBOP2()");
    }
}