package xyz.bolitao.abstract_factory;

public interface Factory {
    public CPU createCPU(String socket);

    public Motherboard createMotherboard();
}
