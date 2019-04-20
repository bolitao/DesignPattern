package xyz.bolitao.strategy;

public class Cashier {
    Member member;

    public Cashier(Member member) {
        this.member = member;
    }

    public double calc(double price) {
        return this.member.calculatePrice(price);
    }
}
