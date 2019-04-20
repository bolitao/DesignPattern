package xyz.bolitao.abstract_factory;

public class IntelFactory implements Factory {

    @Override
    public CPU createCPU(String socket) {
        return new IntelCpu(socket);
    }

    @Override
    public Motherboard createMotherboard() {
        return new IntelMotherboard();
    }
}
