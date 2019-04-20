package xyz.bolitao.strategy;

public class NormalMember implements Member {

    @Override
    public double calculatePrice(double price) {
        System.out.println("普通会员，没有折扣");
        return price;
    }
}
