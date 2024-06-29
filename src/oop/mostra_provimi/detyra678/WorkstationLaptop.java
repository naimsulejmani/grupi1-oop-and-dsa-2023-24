package oop.mostra_provimi.detyra678;

public class WorkstationLaptop extends Laptop {
    private int cache;

    public WorkstationLaptop(String brand, String model, int ram, int cpu, int cache) {
        super(brand, model, ram, cpu);
        this.cache = cache;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}
