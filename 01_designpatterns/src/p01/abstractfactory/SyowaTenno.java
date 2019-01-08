package p01.abstractfactory;

public class SyowaTenno extends AbstractTenno{
    public SyowaTenno() {
        super("裕仁");
    }
    @Override
    public void mikotonori() {
        System.out.println("朕の名は" + this.name);
    }
}
