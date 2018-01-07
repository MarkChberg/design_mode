package factorymethd.pattern;

/** 負責定義產品對象的產生 */
public abstract class Creator {
    // 只要實現Product接口的產品都可以通過此方法來進行創建
    public abstract <T extends Product> T createProduct(Class<T> c);
}

/** eg */

class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance(); // 通過反射來進行創建對象
        } catch (Exception e) {
            // skip
        }
        return (T) product;
    }
}
