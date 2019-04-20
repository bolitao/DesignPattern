package xyz.bolitao.adapter;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Charger220();
        Adapter adapter = new Adapter(adaptee);
        adapter.r110v();
    }
}
