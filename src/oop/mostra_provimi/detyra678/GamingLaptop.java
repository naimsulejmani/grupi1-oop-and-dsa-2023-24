package oop.mostra_provimi.detyra678;

public class GamingLaptop extends Laptop {
    private String gpu;

    public GamingLaptop(String brand, String model, int ram, int cpu) {
        super(brand, model, ram, cpu);
    }

    public GamingLaptop(String brand, String model, int ram, int cpu, String gpu) {
        super(brand, model, ram, cpu);
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
