package proxy.pattern;
/** 代理類和實際類都實現同一個接口 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {

    }

    private void after() {

    }
}
