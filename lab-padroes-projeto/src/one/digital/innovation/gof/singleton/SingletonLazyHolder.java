package one.digital.innovation.gof.singleton;

/**
 *  Singleton "Lazy Holder".
 *
 * @author Dalthon
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }

}
