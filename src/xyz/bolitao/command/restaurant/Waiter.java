package xyz.bolitao.command.restaurant;

import java.util.LinkedList;
import java.util.Queue;

class Waiter {
    private Queue<Command> commands = new LinkedList<>();

    void addOrder(Command command) {
        commands.add(command);
    }

    void removeOrder(Command command) {
        commands.remove(command);
    }

    void sendOrder() {
        while (!commands.isEmpty()) {
            Command command = commands.poll();
            command.execute();
        }
    }
}
