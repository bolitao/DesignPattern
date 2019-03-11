package xyz.bolitao.command.restaurant;

public class Tester {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Command noodleCommand = new NoodleCommand(chef);
        Command beefCommand = new BeefCommand(chef);
        waiter.addOrder(noodleCommand);
        waiter.addOrder(beefCommand);
        waiter.sendOrder();
    }
}
