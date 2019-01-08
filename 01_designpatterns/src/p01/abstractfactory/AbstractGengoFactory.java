package p01.abstractfactory;

public abstract class AbstractGengoFactory {
    public static AbstractGengoFactory create(int factoryId){
        switch(factoryId) {
            case SyowaFactory.id:
                return new SyowaFactory();
            case HeiseiFactory.id:
                return new HeiseiFactory();
            default:
                return null;
        }
    }

    public abstract AbstractGengo createGengo();
    public abstract AbstractTenno createTenno();
}
