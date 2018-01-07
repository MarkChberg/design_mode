package singleton.pattern;
/** 單例模式：確保類只有一個實例，自行實例化并系統提供這個對象 */
public class Singleton {
}

class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();
    //私有化構造器
    private SingletonPattern(){}

    //向系統去提供這個唯一的對象
    public static SingletonPattern getSingletonPattern() {
        return singletonPattern;
    }

    public static void doSomething() {
        //類中的其他方法
    }
}


