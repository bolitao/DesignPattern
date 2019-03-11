package xyz.bolitao.command.restaurant;

public class BeefCommand implements Command {
    private Chef chef;

    BeefCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookBeef();
    }
}
