package oop.generics;

public class Borxhliu implements Comparable<Borxhliu> {
    private String emri;
    private double borxhi;

    public Borxhliu(String emri, double borxhi) {
        this.emri = emri;
        this.borxhi = borxhi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public double getBorxhi() {
        return borxhi;
    }

    public void setBorxhi(double borxhi) {
        this.borxhi = borxhi;
    }

    @Override
    public String toString() {
        return "Borxhliu{" +
                "emri='" + emri + '\'' +
                ", borxhi=" + borxhi +
                '}';
    }

    @Override
    public int compareTo(Borxhliu o) {
        return Double.compare(borxhi, o.borxhi);
    }
}



