package xyz.bolitao.abstract_factory;

public class IntelMotherboard implements Motherboard {
    @Override
    public void show() {
        System.out.println("Intel motherboard");
    }
}
