package xyz.bolitao.abstract_factory;

public class IntelCpu implements CPU {
    String socket;

    public IntelCpu(String socket) {
        this.socket = socket;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU, socket: " + socket);
    }
}
