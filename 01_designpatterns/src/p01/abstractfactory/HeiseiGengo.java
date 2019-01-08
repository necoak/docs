package p01.abstractfactory;

public class HeiseiGengo extends AbstractGengo {

    public HeiseiGengo() {
        super("平成");
    }
    @Override
    public void happyo() {
        System.out.println("小渕官房長官が"+this.name+"と発表された");
    }
}
