package Q3;

public class ConcreteFactory1 extends AbstractFactoryA {
    public static AbstractProductA createProductA1() {
        return new ProductA1("ProductA1");
    }
    public static AbstractProductA createProductA2() {
        return new ProductA2("ProductA2");
    }
}