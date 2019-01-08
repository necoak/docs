package p01.abstractfactory;

public class HeiseiTenno extends AbstractTenno {

    public HeiseiTenno(){
        super("明仁");
    }

    @Override
    public void mikotonori() {
        System.out.println("朕の名は"+this.name+"である");
    }
}
