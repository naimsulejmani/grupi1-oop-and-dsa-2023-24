package oop.mostra_provimi;

public class Center {
    private String address;
    private String city;
    private String state;
    private int totalProduction;

    public Center(String state, String address, String city, int totalProduction) {
        this.state = state;
        this.address = address;
        this.city = city;
        this.totalProduction = totalProduction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotalProduction() {
        return totalProduction;
    }

    public void setTotalProduction(int totalProduction) {
        this.totalProduction = totalProduction;
    }

    @Override
    public String toString() {
        return "Center{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", totalProduction=" + totalProduction +
                '}';
    }
}
