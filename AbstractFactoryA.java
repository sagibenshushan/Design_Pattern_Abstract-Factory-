package Q3;

abstract class AbstractFactoryA extends AbstractFactory {
    @Override
    public AbstractProductA getProduct(int productType, String arg) {
        if (productType == 1) {
            return ConcreteFactory1.createProductA1();
        } else if (productType == 2) {
            return ConcreteFactory1.createProductA2();
        } else {
            return null;
        }
    }
}