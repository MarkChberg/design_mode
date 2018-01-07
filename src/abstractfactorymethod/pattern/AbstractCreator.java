package abstractfactorymethod.pattern;

public abstract class AbstractCreator {
    // 創建產品A類
    public abstract AbstractProductA createProductA();
    // 創建產品B類
    public abstract AbstractProductB createProductB();
}

/** eg ： 有M個產品就應該有M個實現工廠類 */
// 創建器1，只創建登記為1的產品
class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

// 創建器2，只創建登記為2的產品
class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
