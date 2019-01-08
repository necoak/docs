package p01.abstractfactory;

public class ClientMain {
    public static void main(String[] args) {
        treatGengo(AbstractGengoFactory.create(SyowaFactory.id));
        treatGengo(AbstractGengoFactory.create(HeiseiFactory.id));
    }

    protected static void treatGengo(AbstractGengoFactory gengoFactory) {
        AbstractGengo gengo = gengoFactory.createGengo();
        AbstractTenno tenno = gengoFactory.createTenno();
        gengo.happyo();
        tenno.mikotonori();
    }
}
