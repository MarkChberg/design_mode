package builer.pattern;

/** 導演類，封裝了內部實現 */
public class Director {
    private AbstractBuiler builder = new ConcreteProduct();

    public Product getProduct() {
        builder.setPart();
        /*
            設置不同的零件，生成不同的產品
         */
        return builder.buildProduct();
    }

}
