package xyz.bolitao.factory;

public class RPGGame implements Product {
    String name;

    public RPGGame(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("I'm a RPG game: " + name);
    }
}
