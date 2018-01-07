package factorymethd.pattern;
/** 工廠方法：定義一個創建對象的接口，讓子類決定實例化哪一個類
 *      Product                 Creator
 *         *                          *
 *         *                          *
 *         *                          *
 *      ConcreteProduct * * * * ConcreteCreator
 * */
public class Factory {
    public static void main () {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct.class);
        // continue to do something
    }
}


