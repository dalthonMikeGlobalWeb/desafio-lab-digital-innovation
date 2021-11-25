package one.digital.innovation.gof.singleton;

import java.util.Objects;

/**
 *  Singleton "Preguiçoso".
 *
 * @author Dalthon
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {

        if (Objects.isNull(instancia)) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }


}
