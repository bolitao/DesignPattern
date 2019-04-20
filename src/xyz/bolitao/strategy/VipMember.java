package xyz.bolitao.strategy;

public class VipMember implements Member {

    @Override
    public double calculatePrice(double price) {
        System.out.println("高级会员，八折");
        return 0.8 * price;
    }
}
