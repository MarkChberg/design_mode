package proxy.pattern.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectIH implements InvocationHandler{
    // 被代理者
    Class cls = null;
    // 被代理的實例
    Object obj = null;

    public SubjectIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*
            before。。。。。
         */
        Object result = method.invoke(this.obj, args);
        /*
            after。。。。。
         */
        return result;

    }
}
