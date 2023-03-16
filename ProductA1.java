package Q3;

class ProductA1 extends AbstractProductA {
    ProductA1(String arg) {
        System.out.println("Hello " + arg);
    }
    @Override
    public void operationAOP1() {
        System.out.println("ProductA1 in operationAOP1()");
    }
    @Override
    public void operationAOP2() {
        System.out.println("ProductA1 in operationAOP2()");
    }
}