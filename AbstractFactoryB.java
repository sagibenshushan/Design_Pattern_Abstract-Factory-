package Q3;

abstract class AbstractFactoryB extends AbstractFactory {
    @Override
    public AbstractProductB getProduct(int productType, String arg) {
        if (productType == 1) {
            return ConcreteFactory2.createProductB1();
        } else if (productType == 2) {
            return ConcreteFactory2.createProductB2();
        } else {
            return null;
        }
    }
}