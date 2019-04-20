package xyz.bolitao.abstract_factory;

public class AMDCpu implements CPU {
    String socket;

    public AMDCpu(String socket) {
        this.socket = socket;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU, socket: " + socket);
    }
}
