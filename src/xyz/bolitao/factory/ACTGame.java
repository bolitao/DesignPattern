package xyz.bolitao.factory;

public class ACTGame implements Product {
    String name;

    public ACTGame(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("I'm a ACT game: " + name);
    }
}
