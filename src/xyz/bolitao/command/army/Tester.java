package xyz.bolitao.command.army;

public class Tester {
    public static void main(String[] args) {
        Ephor ephor = new Ephor();
        Army army = new Army();
        Command command = new SneakAttactCommand(army);
        ephor.startExecuteCommand(command);
    }
}
