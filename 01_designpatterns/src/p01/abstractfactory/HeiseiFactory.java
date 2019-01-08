package p01.abstractfactory;

public class HeiseiFactory extends AbstractGengoFactory {
    public static final int id = 2;
    @Override
    public AbstractGengo createGengo() {
        return new HeiseiGengo();
    }

    @Override
    public AbstractTenno createTenno() {
        return new HeiseiTenno();
    }
}
