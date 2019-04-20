package xyz.bolitao.abstract_factory;

public class AMDFactory implements Factory {
    @Override
    public CPU createCPU(String socket) {
        return new AMDCpu(socket);
    }

    @Override
    public Motherboard createMotherboard() {
        return new AMDMotherboard();
    }
}
