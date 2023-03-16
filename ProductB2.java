package Q3;

public class ProductB2 extends AbstractProductB {
    ProductB2(String arg) {
        System.out.println("Hello " + arg);
    }
    @Override
    public void operationBOP1() {
        System.out.println("ProductB2 in operationBOP1()");
    }
    @Override
    public void operationBOP2() {
        System.out.println("ProductB2 in operationBOP2()");
    }
}