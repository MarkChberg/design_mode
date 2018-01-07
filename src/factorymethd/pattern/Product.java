package factorymethd.pattern;

/** 抽象的產品類：產品可以有多個 */
public abstract class Product {

    public void method1() {
        //do something
    }

    public abstract void method2(); // 讓子類去實現這個具體的方法
}

/** eg */
class ConcreteProduct extends Product {

    @Override
    public void method2() {
        //do something
    }
}
