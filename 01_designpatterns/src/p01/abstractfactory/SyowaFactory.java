package p01.abstractfactory;

public class SyowaFactory extends AbstractGengoFactory {
    public static final int id = 1;

    @Override
    public AbstractGengo createGengo() {
        return new SyowaGengo();
    }

    @Override
    public AbstractTenno createTenno() {
        return new SyowaTenno();
    }
}
