package tempaltemethod.pattern;

public abstract class AbstractClass {

    protected abstract void doSomething();

    protected abstract void doAnything();

    public final void templateMethod() {
        /*
            處理相關的邏輯
         */
        this.doAnything();
        this.doSomething();
        /*
            處理相關的邏輯
         */
    }
}

class ConcreteClass1 extends AbstractClass {

    @Override
    protected void doSomething() {
        // 業務邏輯代碼
    }

    @Override
    protected void doAnything() {
        // 業務邏輯代碼
    }
}
