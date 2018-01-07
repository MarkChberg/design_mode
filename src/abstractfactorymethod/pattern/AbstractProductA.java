package abstractfactorymethod.pattern;

public abstract class AbstractProductA {
    // 每個產品共有的方法
    public void shareMethod() {

    }

    // 每個產品的不同實現
    public abstract void doSomething();
}

/** eg */
class ProductA1 extends AbstractProductA {

    @Override
    public void doSomething() {
        System.out.println("產品A1的實現方法");
    }
}

class ProductA2 extends AbstractProductA {

    @Override
    public void doSomething() {
        System.out.println("產品A2的實現方法");
    }
}


