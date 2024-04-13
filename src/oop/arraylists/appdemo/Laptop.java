package oop.arraylists.appdemo;

public class Laptop {

    //krijon lidhjen ndermjet laptop dhe motherboard
    // kur e krijon nje objekt llaptopi, mundet me pas motherboard brenda
    private Motherboard motherboard = new Motherboard();

    //duke supozu qe nuk na vjen referenca null e motherboard-it
    public Laptop(Motherboard motherboard) {
        if (motherboard != null)
            this.motherboard = motherboard;
    }
}
