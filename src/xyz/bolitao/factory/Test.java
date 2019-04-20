package xyz.bolitao.factory;

public class Test {
    public static void main(String[] args) {
        CDPRFactory cdprFactory = new CDPRFactory();
//        Product product1 = cdprFactory.produce("Cyberpunk 2077", "RPG");
        Product product1 = cdprFactory.produce("Cyberpunk 2077");
        product1.show();
        CapcomFactory capcomFactory = new CapcomFactory();
//        Product product2 = capcomFactory.produce("DMC 6", "ACT");
        Product product2 = capcomFactory.produce("DMC 6");
        product2.show();
//        Product product3 = capcomFactory.produce("MH Moon", "RPG");
//        product3.show();
    }
}
