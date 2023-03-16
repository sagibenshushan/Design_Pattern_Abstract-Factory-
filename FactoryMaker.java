package Q3;

class FactoryMaker {
    private static AbstractFactory pf = null;
    static AbstractFactory getFactory(String choice) {
        if (choice.equals("1")) {
            pf = new ConcreteFactory1();
        } else if (choice.equals("2")) {
            pf = new ConcreteFactory2();
        }
        return pf;
    }
}