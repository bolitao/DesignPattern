package xyz.bolitao.command.army;

public class SneakAttactCommand implements Command {
    Army army;

    public SneakAttactCommand(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.sneakAttact();
    }
}
