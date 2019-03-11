package xyz.bolitao.command.army;

public class Ephor {
    Command command;

    void startExecuteCommand(Command command) {
        command.execute();
    }
}
