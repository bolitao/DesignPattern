package xyz.bolitao.adapter;

public class Charger220 implements Adaptee {
    @Override
    public void r220v() {
        System.out.println("220V");
    }
}
