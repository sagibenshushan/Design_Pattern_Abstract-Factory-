package Q3;

public class ConcreteFactory2 extends AbstractFactoryB {
    public static AbstractProductB createProductB1() {
        return new ProductB1("ProductB1");
    }
    public static AbstractProductB createProductB2() {
        return new ProductB2("ProductB2");
    }
}