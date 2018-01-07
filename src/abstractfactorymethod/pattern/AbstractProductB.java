package abstractfactorymethod.pattern;

public abstract class AbstractProductB {
    public abstract void doSomething();
}

class ProductB1 extends AbstractProductB {

    @Override
    public void doSomething() {
        System.out.println("產品B1的實現方法");
    }
}

class ProductB2 extends AbstractProductB {

    @Override
    public void doSomething() {
        System.out.println("產品B2的實現方法");
    }
}
