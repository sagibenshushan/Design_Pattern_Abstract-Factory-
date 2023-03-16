package Q3;

public class Client {
    public static void main(String[] args) {
        AbstractFactory pf1 = FactoryMaker.getFactory("1");
        AbstractProductA pA1 = (AbstractProductA) pf1.getProduct(1, "ProductA1");
        AbstractProductA pA2 = (AbstractProductA) pf1.getProduct(2, "ProductA2");

        pA1.operationAOP1();
        pA1.operationAOP2();
        pA2.operationAOP1();
        pA2.operationAOP2();

        AbstractFactory pf2 = FactoryMaker.getFactory("2");
        AbstractProductB pB1 = (AbstractProductB) pf2.getProduct(1, "ProductB1");
        AbstractProductB pB2 = (AbstractProductB) pf2.getProduct(2, "ProductB2");

        pB1.operationBOP1();
        pB1.operationBOP2();
        pB2.operationBOP1();
        pB2.operationBOP2();
    }
}