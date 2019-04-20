package xyz.bolitao.strategy;

public class Main {
    public static void main(String[] args) {
        Member normal = new NormalMember();
        Cashier cashier = new Cashier(normal);
        System.out.println(cashier.calc(300));
        Member vip = new VipMember();
        cashier = new Cashier(vip);
        System.out.println(cashier.calc(300));
    }
}
