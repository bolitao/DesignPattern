package xyz.bolitao.abstract_factory;

public class Test {
    public static void main(String[] args) {
        AMDFactory amdFactory = new AMDFactory();
        IntelFactory intelFactory = new IntelFactory();
        CPU amdCpu = amdFactory.createCPU("AM4");
        amdCpu.calculate();
        Motherboard amdMotherboard = amdFactory.createMotherboard();
        amdMotherboard.show();
        CPU intelCpu = intelFactory.createCPU("LGA 1151");
        intelCpu.calculate();
        Motherboard intelMotherboard = intelFactory.createMotherboard();
        intelMotherboard.show();
    }
}
