package xyz.bolitao.facade;

public class Test {
    public static void main(String[] args) {
        MiSmartHome app = new MiSmartHome(new Router(), new TV(), new Lamp());
        app.on();
        app.off();
    }
}
