package Q3;

public class ProductA2 extends AbstractProductA {
    ProductA2(String arg) {
        System.out.println("Hello " + arg);
    }
    @Override
    public void operationAOP1() {
        System.out.println("ProductA2 in operationAOP1()");
    }
    @Override
    public void operationAOP2() {
        System.out.println("ProductA2 in operationAOP2()");
    }
}