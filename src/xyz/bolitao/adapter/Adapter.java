package xyz.bolitao.adapter;

public class Adapter implements Targer {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void r110v() {
        // 变压的具体操作，这里简化仅做输出
        this.adaptee.r220v();
    }
}
