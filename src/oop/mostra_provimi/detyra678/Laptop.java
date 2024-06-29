package oop.mostra_provimi.detyra678;

public abstract class Laptop  implements Switchable {
    private String brand;
    private String model;
    private int ram;
    private int cpu;


    public Laptop(String brand, String model, int ram, int cpu) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) throws LaptopException {
        if (ram<0) {
            throw new LaptopException("Nuk lejohet ram negativ");
        }
        this.ram = ram;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public void switchOn() {
        System.out.println("Laptp is switching on");
    }

    @Override
    public void switchOff() {
        System.out.println("Laptp is switching off");
    }
}
