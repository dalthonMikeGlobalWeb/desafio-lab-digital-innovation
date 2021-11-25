package one.digital.innovation.gof.singleton;

/**
 *  Singleton "Apressado".
 *
 * @author Dalthon
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }

}
