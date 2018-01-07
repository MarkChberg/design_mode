package builer.pattern;

public abstract class AbstractBuiler {
    // 設置產品的不同部分，以獲得不同的產品
    public abstract void setPart();
    // 建造產品
    public abstract Product buildProduct();
}

/** eg */
class ConcreteProduct extends AbstractBuiler {

    Product product = new Product();

    @Override
    public void setPart() {
        /*
            產品內的邏輯處理
         */
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
