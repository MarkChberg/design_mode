package proxy.pattern.dynamic;

import proxy.pattern.RealSubject;
import proxy.pattern.Subject;

import java.lang.reflect.Proxy;

/** 動態代理：
 *
 *     ************* DynamicProxy(返回動態代理對象，可以在返回中增加Advice，當然SubjectIH中就可以事項Advice功能，此舉為了解耦(AOP的原理))
 *     *                *
 *     *                *
 *  IAdvice ****** InvocationHandler(I)                Subject
 *     *                *                                 *
 *     *                *                                 *
 *     *                *                                 *
 *  ConcreteAdvice      *                                 *
 *              SubjectIH ************************* RealSubject
 *                               *
 *                               *
 *                               *
 *                              Client（調用Proxy方法，也可以使用匿名類的形式去實現）
 * */
public class DynamicProxy {
    public static void main() {
        Subject subject = new RealSubject();
        SubjectIH subjectIH = new SubjectIH(subject);
        Subject subProxy
                = (Subject) Proxy.newProxyInstance(
                        subject.getClass().getClassLoader()
                        , subject.getClass().getInterfaces()
                        , subjectIH ); // 只要代理對象在此實現了InvocationHandler接口，那麼通過此方法可以獲得代理對象
        subProxy.request();
    }
}
