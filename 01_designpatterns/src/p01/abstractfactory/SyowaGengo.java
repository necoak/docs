package p01.abstractfactory;

public class SyowaGengo extends AbstractGengo{
    public SyowaGengo(){
        super("昭和");
    }
    @Override
    public void happyo() {
        System.out.println("天皇自ら"+this.name+"と発表なされた");
    }
}
